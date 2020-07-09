package menu;


import java.io.IOException;
import servise.Container;
import servise.IMenuItem;

public class MenuPartSort<T> implements IMenuItem<T> {

  private Container<T> container;

  public MenuPartSort(Container container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 5;
  }

  @Override
  public String getTitle() {
    return "To sort the items";
  }

  @Override
  public void execute() throws IOException {
    container.sort();
  }
}
