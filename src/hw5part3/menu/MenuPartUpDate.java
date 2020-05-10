package HwFivePartThree.menu;

import HwFivePartThree.servise.GenericFactory;
import HwFivePartThree.servise.GenericsContainer;
import HwFivePartThree.servise.IMenuItem;
import HwFivePartThree.servise.ScannerWrapper;

public class MenuPartUpDate <T> implements IMenuItem<T> {

  private GenericsContainer <T> container;
  private ScannerWrapper sc = new ScannerWrapper();
  private GenericFactory<T> factory;

  public MenuPartUpDate(GenericsContainer container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 2;
  }

  @Override
  public String getTitle() {
    return "Update an object by index";
  }

  @Override
  public void execute() {
    System.out.println("Input index");
    int choice = sc.nextInt(0, container.getSize());
    container.update (choice, factory.produce());
  }
}
