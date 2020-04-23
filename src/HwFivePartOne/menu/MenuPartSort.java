package HwFivePartOne.menu;

import HwFivePartOne.servise.SchoolContainer;

public class MenuPartSort implements IMenuItem {

  private SchoolContainer container;

  public MenuPartSort(SchoolContainer container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 5;
  }

  @Override
  public String getTitle() {
    return "Sort objects using natural order";
  }

  @Override
  public void execute() {
   container.sort();
  }
}
