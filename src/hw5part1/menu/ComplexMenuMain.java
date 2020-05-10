package HwFivePartOne.menu;

import HwFivePartOne.servise.SchoolContainer;
import HwFivePartOne.bus.model.SchoolFactory;

public class ComplexMenuMain {

  public static void main(String[] args) {
    SchoolContainer container = new SchoolContainer();
    SchoolFactory factory = new SchoolFactory();

    IMenuItem[] array = {
        new MenuPartAdd(container, factory),
        new MenuPartUpDate(container),
        new MenuPartDelete(container),
        new MenuPartPrint(container),
        new MenuPartSort(container),
        new MenuPartAction(container)
    };
    new MenuPartStart(array, "top menu").run();
  }
}
