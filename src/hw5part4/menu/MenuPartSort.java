package hw5part3.menu;

import hw5part3.servise.GenericsContainer;
import hw5part3.servise.IMenuItem;

public class MenuPartSort<T> implements IMenuItem<T> {

  private GenericsContainer <T> container;

  public MenuPartSort(GenericsContainer container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 5;
  }

  @Override
  public String getTitle() {
    return "To sort the items";
  }

  @Override
  public void execute() {
   container.sort();
  }
}
