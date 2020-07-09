package menu;

import bus.model.FactoryComEquipment;
import servise.Container;
import servise.IMenuItem;
import servise.ScannerWrapper;

public class MenuPartAdd<T> implements IMenuItem {

  ScannerWrapper sc = new ScannerWrapper();
  private Container container;
  private FactoryComEquipment factory;

  public MenuPartAdd(Container container,
      FactoryComEquipment factory) {
    this.container = container;
    this.factory = factory;
  }

  @Override
  public int getOrder() {
    return 1;
  }

  @Override
  public String getTitle() {
    return "Create new object";
  }

  @Override
  public void execute() {
   container.add(factory.produce());
  }
}
