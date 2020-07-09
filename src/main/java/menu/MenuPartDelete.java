package menu;

import servise.Container;
import servise.IMenuItem;
import servise.ScannerWrapper;

public class MenuPartDelete <T> implements IMenuItem<T> {

    private Container<T> container;
    private ScannerWrapper sc = new ScannerWrapper();

    public MenuPartDelete(Container container) {
        this.container = container;
    }

    @Override
    public int getOrder() {
        return 3;
    }

    @Override
    public String getTitle() {
        return "Delete element";
    }

    @Override
    public void execute() {
        System.out.println("Input index element which should delete");
        int choice = sc.nextInt(0, container.size());
        container.delete(choice);
    }
}
