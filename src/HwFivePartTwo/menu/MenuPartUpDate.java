package HwFivePartTwo.menu;

import HwFivePartTwo.servise.GenericFactory;
import HwFivePartTwo.servise.IMenuItem;
import HwFivePartTwo.servise.ScannerWrapper;
import HwFivePartTwo.servise.GenericsContainer;

public class MenuPartUpDate <T> implements IMenuItem <T> {

  private GenericsContainer container;
  private ScannerWrapper sc = new ScannerWrapper();
  private GenericFactory <T> factory;

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
