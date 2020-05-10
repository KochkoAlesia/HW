package hw5part3.menu;

import hw5part3.servise.GenericsContainer;
import hw5part3.servise.IMenuItem;

public class MenuPartPrint<T> implements IMenuItem<T> {

  private GenericsContainer<T> container;

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
