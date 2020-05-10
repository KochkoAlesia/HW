package hw5part3.menu;

import hw5part3.servise.GenericsContainer;
import hw5part3.servise.IMenuItem;

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
