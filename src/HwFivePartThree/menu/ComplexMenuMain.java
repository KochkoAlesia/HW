package HwFivePartThree.menu;

import HwFivePartThree.servise.GenericFactory;
import HwFivePartThree.servise.GenericsContainer;
import HwFivePartThree.servise.IMenuItem;

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
        // в первой строке данного метода мы на вход должны передавать разные фабрики, в зависимости
        // от выбора на консоле. Не до конца понимаю как это реализовать
        new MenuPartAdd (container, factory),
        new MenuPartUpDate(container),
        new MenuPartDelete(container),
        new MenuPartPrint(container),
        new MenuPartSort(container),
        new MenuPartReplace(container),
        new MenuPartSaveToFile(container)
    };

    new MenuPartStart(array, "sub menu").run();
  }
}
