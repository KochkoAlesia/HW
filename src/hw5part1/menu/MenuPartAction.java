package HwFivePartOne.menu;

import HwFivePartOne.servise.SchoolContainer;

public class MenuPartAction implements IMenuItem {

  private SchoolContainer container;

  public MenuPartAction(SchoolContainer container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 6;
  }

  @Override
  public String getTitle() {
    return "Calculate the average age";
  }

  @Override
  public void execute() {
    container.averageAge();
  }
}
