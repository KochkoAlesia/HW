package HwFivePartTwo.menu;

import HwFivePartTwo.servise.GenericsContainer;
import HwFivePartTwo.servise.IMenuItem;

public class MenuPartPrint<T> implements IMenuItem<T> {

  private GenericsContainer container;

  public MenuPartPrint(GenericsContainer container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 4;
  }

  @Override
  public String getTitle() {
    return "Output a list of elements";
  }

  @Override
  public void execute() {
    container.printArray();
  }
}
