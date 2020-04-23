package HwFivePartThree.menu;

import HwFivePartThree.bus.model.FactoryComEquipmentFromConsole;
import HwFivePartThree.servise.GenericFactory;
import HwFivePartThree.servise.GenericsContainer;
import HwFivePartThree.servise.IMenuItem;

public class MenuPartSaveToFile implements IMenuItem {

  GenericsContainer container = new GenericsContainer();

  public MenuPartSaveToFile(GenericsContainer container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 7;
  }

  @Override
  public String getTitle() {
    return "Save object to File";
  }

  @Override
  public void execute() {
   container.saveObjectToFile();
  }
}
