package server.part;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import servise.Container;

public class NetworkClientContainer<T extends Serializable> implements Container<T> {

  private final Socket socket;
  private final ObjectOutputStream oos;
  private final ObjectInputStream ois;

  public NetworkClientContainer(String host, int port) throws IOException {
    socket = new Socket(host, port);
    oos = new ObjectOutputStream(socket.getOutputStream());
    ois = new ObjectInputStream(socket.getInputStream());
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public void add(T element) {
    Request request = new Request(TypeOfSupportedQueries.POST, element);
    try {
      oos.writeObject(request);
      oos.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void put(int index, T element) {
    Request request = new Request(TypeOfSupportedQueries.PUT, new UpdatePayload(index, element));
    try {
      oos.writeObject(request);
      oos.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  @Override
  public void delete(int index) {
    Request request = new Request(TypeOfSupportedQueries.DELETE, index);
    try {
      oos.writeObject(request);
      oos.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

   @Override
  public void sort() throws IOException {
    Request request = new Request(TypeOfSupportedQueries.GET.OPTIONS, null);
    oos.writeObject(request);
    oos.flush();
    try {
      Response response = (Response) ois.readObject();
      System.out.println(response.getPayload());

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
//  public void sort(Comparator<T> c) throws IOException {
//    Request request = new Request(TypeOfSupportedQueries.GET.OPTIONS, null);
//    oos.writeObject(request);
//    oos.flush();
//    try {
//      Response response = (Response) ois.readObject();
//      System.out.println(response.getPayload());
//
//    } catch (ClassNotFoundException e) {
//      e.printStackTrace();
//    }
//  }




  @Override
  @SuppressWarnings("unchecked")
  public Collection<T> getAll() {
    Request request = new Request(TypeOfSupportedQueries.GET, null);

    try {
      oos.writeObject(request);
      oos.flush();
      Response response = (Response) ois.readObject();
      return (Collection<T>) response.getPayload();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      return Collections.emptyList();
    }
  }
}

