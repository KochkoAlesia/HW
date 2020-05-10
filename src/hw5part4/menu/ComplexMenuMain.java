package hw5part3.menu;

import hw5part3.servise.GenericFactory;
import hw5part3.servise.GenericsContainer;
import hw5part3.servise.IMenuItem;

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
