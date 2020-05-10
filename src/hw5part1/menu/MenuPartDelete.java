package HwFivePartOne.menu;

import HwFivePartOne.servise.ScannerWrapper;
import HwFivePartOne.servise.SchoolContainer;

public class MenuPartDelete implements IMenuItem {

    private SchoolContainer container;
    private ScannerWrapper sc = new ScannerWrapper();

    public MenuPartDelete(SchoolContainer container) {
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
        System.out.println("Input index");
        int choice = sc.nextInt(0, container.getSize());
        container.delete(choice);
    }
}
