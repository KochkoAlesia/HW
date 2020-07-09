package menu;


import bus.model.FactoryComEquipment;
import servise.Container;
import servise.IMenuItem;
import servise.ScannerWrapper;

public class MenuPartUpDate<T> implements IMenuItem<T> {

  private Container<T> container;
  private ScannerWrapper sc = new ScannerWrapper();
  private FactoryComEquipment factory;

  public MenuPartUpDate(Container<T> container,
      FactoryComEquipment factory) {
    this.container = container;
    this.factory = factory;
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
    int choice = sc.nextInt(0, container.size());
    container.put(choice, (T) factory.produce());
  }
}
