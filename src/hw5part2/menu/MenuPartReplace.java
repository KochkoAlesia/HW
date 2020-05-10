package HwFivePartTwo.menu;

import HwFivePartTwo.servise.GenericsContainer;
import HwFivePartTwo.servise.IMenuItem;
import HwFivePartTwo.servise.ScannerWrapper;

public class MenuPartReplace<T> implements IMenuItem<T> {

  private ScannerWrapper sc = new ScannerWrapper();
  private GenericsContainer container;

  public MenuPartReplace(GenericsContainer container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 6;
  }

  @Override
  public String getTitle() {
    return "Replace elements by index";
  }

  @Override
  public void execute() {
    System.out.println("Input index one");
    int choice = sc.nextInt(0, container.getSize());
    System.out.println("Input index two");
    int choice1 = sc.nextInt(0, container.getSize());
    container.replace(choice, choice1);
  }
}
