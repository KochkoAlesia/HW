package menu;

import bus.model.FactoryComEquipment;
import bus.model.MainComputerEquipment;
import java.io.IOException;
import server.part.NetworkClientContainer;
import servise.Container;
import servise.GenericFactory;
import servise.IMenuItem;

public class ComplexMenuMainNetwork {
  public static void main(String[] args) throws IOException {
    GenericFactory<MainComputerEquipment<?>> factory = new FactoryComEquipment();
    Container<MainComputerEquipment<?>> container = new NetworkClientContainer<MainComputerEquipment<?>>("localhost", 8080);

    IMenuItem<MainComputerEquipment<?>>[] items = new IMenuItem[3];

        IMenuItem[] array = {
        new MenuPartAdd(container, (FactoryComEquipment) factory),
        new MenuPartUpDate(container, (FactoryComEquipment) factory),
        new MenuPartDelete(container),
        new MenuPartPrint(container),
        new MenuPartSort(container),
    };

    new MenuPartStart(array, "sub menu").run();
  }
}
