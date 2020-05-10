package hw5part3.menu;

import hw5part3.servise.GenericFactory;
import hw5part3.servise.GenericsContainer;
import hw5part3.servise.IMenuItem;
import hw5part3.servise.ScannerWrapper;

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
