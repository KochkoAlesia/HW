package hw5part3.menu;

import hw5part3.servise.IMenuItem;
import hw5part3.servise.ScannerWrapper;

public class MenuPartStart <T> implements IMenuItem<T> {

    private IMenuItem<T>[] items;
    private ScannerWrapper sc = new ScannerWrapper();
    private String title;
    private int order;

    public MenuPartStart(IMenuItem<T>[] items, String title) {
        this.items = items;
        this.title = title;
    }

    @Override
    public int getOrder() {
        return order;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void execute() {
        run();
    }

    public void run() {
        while (true) {
            printHelp();
            int choice = sc.nextInt();
            if (choice == 0) {
                return;
            }
            for (IMenuItem item : items) {
                if (item.getOrder() == choice) {
                    item.execute();
                    break;
                }
            }
        }
    }

    private void printHelp() {
        for (IMenuItem item : items) {
            System.out.println(item.getOrder() + " - " + item.getTitle());
        }
        System.out.println("0 - exit");
    }
}
