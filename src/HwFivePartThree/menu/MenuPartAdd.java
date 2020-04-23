package HwFivePartThree.menu;

import HwFivePartThree.servise.GenericFactory;
import HwFivePartThree.servise.GenericsContainer;
import HwFivePartThree.servise.IMenuItem;
import HwFivePartThree.servise.ScannerWrapper;
import java.util.InputMismatchException;

public class MenuPartAdd<T> implements IMenuItem {

  ScannerWrapper sc = new ScannerWrapper();
  private GenericsContainer container;
  private GenericFactory<T> factory;

  public MenuPartAdd(GenericsContainer container, GenericFactory<T> factory) {
    this.container = container;
    this.factory = factory;
  }

  @Override
  public int getOrder() {
    return 1;
  }

  @Override
  public String getTitle() {
    return "Select the type of object to create";
  }

  @Override
  public void execute() {
    try {
      System.out.println("1 - Add object from file");
      System.out.println("2 - Add object from console");
      int key;
      key = sc.nextInt();
      switch (key) {
        case 1:
          container.addObjectWithFile(factory);
          break;
        case 2:
          container.addObjectWithConsole(factory);
      }
    } catch (InputMismatchException i) {
      System.out.println("Check you choose");
    }
  }
}
