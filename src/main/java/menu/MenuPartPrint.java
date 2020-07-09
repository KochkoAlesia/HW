package menu;


import java.util.Collection;
import servise.Container;
import servise.IMenuItem;

public class MenuPartPrint<T> implements IMenuItem<T> {

  private Container<T> container;

  public MenuPartPrint(Container container) {
    this.container = container;
  }

  @Override
  public int getOrder() {
    return 4;
  }

  @Override
  public String getTitle() {
    return "Output a list of elements (print all)";
  }

  @Override
  public void execute() {
    Collection <T> content = container.getAll();
    for (T object : content) {
      System.out.println(object.toString());
    }

  }
}
