package HwFivePartTwo.menu;

import HwFivePartTwo.servise.GenericFactory;
import HwFivePartTwo.servise.GenericsContainer;
import HwFivePartTwo.servise.IMenuItem;

public class ComplexMenuMain {

  public static void main(String[] args) {
    GenericsContainer container = new GenericsContainer();
    // в этой части кода необходимо создать реальный объект. Пока чтобы работала просто укажу сигнатуру...
    GenericFactory factory = new GenericFactory() {
      @Override
      public Object produce() {
        return null;
      }
    };

    IMenuItem[] array = {
        new MenuPartAdd(container, factory),
        new MenuPartUpDate(container),
        new MenuPartDelete(container),
        new MenuPartPrint(container),
        new MenuPartSort(container),
        new MenuPartReplace(container)
    };
    new MenuPartStart(array, "top menu").run();
  }
}
