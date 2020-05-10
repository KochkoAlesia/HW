package HwFivePartOne.menu;

import HwFivePartOne.servise.ScannerWrapper;

public class MenuPartStart implements IMenuItem {

    private IMenuItem[] items;
    private ScannerWrapper sc = new ScannerWrapper();
    private String title;
    private int order;

    public MenuPartStart(IMenuItem[] items, String title) {
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
