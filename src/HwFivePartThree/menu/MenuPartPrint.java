package HwFivePartThree.menu;

import HwFivePartThree.servise.GenericsContainer;
import HwFivePartThree.servise.IMenuItem;

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
    return "Output a list of elements (print all)";
  }

  @Override
  public void execute() {
    container.printArray();
  }
}
