package HwFivePartTwo.menu;

import HwFivePartTwo.servise.GenericsContainer;
import HwFivePartTwo.servise.IMenuItem;

public class MenuPartSort<T> implements IMenuItem<T> {

  private GenericsContainer container;

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
