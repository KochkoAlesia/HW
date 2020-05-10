package HwFivePartOne.menu;

import HwFivePartOne.servise.SchoolContainer;

public class MenuPartPrint implements IMenuItem {

  private SchoolContainer container;

  public MenuPartPrint(SchoolContainer container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 4;
  }

  @Override
  public String getTitle() {
    return "Print all";
  }

  @Override
  public void execute() {
    container.print();
  }
}
