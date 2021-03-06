package HwFivePartTwo.menu;

import HwFivePartTwo.servise.GenericsContainer;
import HwFivePartTwo.servise.IMenuItem;
import HwFivePartTwo.servise.ScannerWrapper;

public class MenuPartDelete<T> implements IMenuItem<T> {

  private GenericsContainer container;
  private ScannerWrapper sc = new ScannerWrapper();

  public MenuPartDelete(GenericsContainer container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 3;
  }

  @Override
  public String getTitle() {
    return "Delete element";
  }

  @Override
  public void execute() {
    System.out.println("Input index");
    int choice = sc.nextInt(0, container.getSize());
    container.delete(choice);
  }
}
