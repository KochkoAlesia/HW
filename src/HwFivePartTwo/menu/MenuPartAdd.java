package HwFivePartTwo.menu;

import HwFivePartTwo.servise.GenericFactory;
import HwFivePartTwo.servise.GenericsContainer;
import HwFivePartTwo.servise.IMenuItem;

public class MenuPartAdd <T> implements IMenuItem <T> {

    private GenericsContainer container;
    private GenericFactory <T> factory;

    public MenuPartAdd(GenericsContainer container, GenericFactory factory) {
        this.container = container;
        this.factory = factory;
    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public String getTitle() {
        return "Add element";
    }

    @Override
    public void execute() {
        container.add(factory.produce());
    }
}
