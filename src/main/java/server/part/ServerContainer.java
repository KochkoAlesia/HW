package server.part;

import bus.model.MainComputerEquipment;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerContainer {

  private static ExecutorService executorService;
  private static CopyOnWriteArrayList<MainComputerEquipment<?>> list = new CopyOnWriteArrayList<>();


  public static void main(String[] args) throws IOException {
    executorService = Executors.newCachedThreadPool();
    ServerSocket serverSocket = new ServerSocket(8080);
    System.out.println("server started");

    while (true) {
      Socket socket = serverSocket.accept();
      System.out.println("new connection opened");
      process(socket);
    }
  }

  private static void process(Socket socket) {
    executorService.submit(new Runnable() {
      @Override
      public void run() {
        try {
          ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
          ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

          System.out.println("ready to communicate");

          while (true) {
            communicate(ois, oos);
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  private static void communicate(ObjectInputStream ois, ObjectOutputStream oos) throws Exception {

    Request request = (Request) ois.readObject();

    System.out.println(request);

    switch (request.getType()) {
      case POST: {
        MainComputerEquipment<?> element = (MainComputerEquipment<?>) request.getPayload();
        list.add(element);
        oos.flush();
        break;
      }
      case GET: {
        Response response = new Response(new ArrayList<>(list));
        oos.writeObject(response);
        oos.flush();
        break;
      }
      case DELETE: {
        int index = (Integer) request.getPayload();
        list.remove(index);
        oos.flush();
        break;
      }
      case PUT: {
        UpdatePayload updateData = (UpdatePayload) request.getPayload();
        MainComputerEquipment<?> element = (MainComputerEquipment<?>) updateData.getElement();
        list.set(updateData.getIndex(), element);
        oos.flush();
        break;
      }
      case OPTIONS: {
        list.sort((o1, o2) -> {
          if (o1.getPrice() == o2.getPrice()) {
            return 0;
          } else if (o1.getPrice() < o2.getPrice()) {
            return -1;

          } else {
            return 1;
          }
        });
        Response response = new Response(list);
        oos.writeObject(response);
       oos.flush();
        break;
      }
    }
  }
}
