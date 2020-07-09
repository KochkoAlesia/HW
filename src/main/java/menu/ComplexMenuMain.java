package menu;

import bus.model.FactoryComEquipment;
import java.io.IOException;
import servise.LocalContainer;
import servise.IMenuItem;

public class ComplexMenuMain {

  public static void main(String[] args) throws IOException {
    LocalContainer container = new LocalContainer();
    FactoryComEquipment factory = new FactoryComEquipment();

    IMenuItem[] array = {
        new MenuPartAdd(container, factory),
        new MenuPartUpDate(container, factory),
        new MenuPartDelete(container),
        new MenuPartPrint(container),
        new MenuPartSort(container),
    };

    new MenuPartStart(array, "sub menu").run();
  }
}
