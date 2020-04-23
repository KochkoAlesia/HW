package HwFivePartOne.menu;

import HwFivePartOne.servise.SchoolContainer;
import HwFivePartOne.bus.model.SchoolFactory;

public class MenuPartAdd implements IMenuItem {

    private SchoolContainer container;
    private SchoolFactory factory;

    public MenuPartAdd(SchoolContainer container, SchoolFactory factory) {
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
