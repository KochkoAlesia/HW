package HwFivePartOne.menu;

import HwFivePartOne.servise.ScannerWrapper;
import HwFivePartOne.servise.SchoolContainer;
import HwFivePartOne.bus.model.SchoolFactory;

public class MenuPartUpDate implements IMenuItem {

  private SchoolContainer container;
  private ScannerWrapper sc = new ScannerWrapper();
  private SchoolFactory factory;

  public MenuPartUpDate(SchoolContainer container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 2;
  }

  @Override
  public String getTitle() {
    return "Update an object by index";
  }

  @Override
  public void execute() {
    System.out.println("Input index");
    int choice = sc.nextInt(0, container.getSize());
    container.update (choice, factory.produce());
  }
}
