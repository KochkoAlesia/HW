package HwFivePartThree.servise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class GenericsContainer<T> {

  private T[] array = (T[]) new Object[20];
  private int size = 0;


  public int getSize() {
    return size;
  }

  public void addObjectWithConsole(T element) {
    if (size == array.length) {
      int newSize = size + (size >> 1);
      T[] advancedArray = (T[]) new Object[newSize];
      System.arraycopy(array, 0, advancedArray, 0, size);
      array = advancedArray;
    } else {
      array[size++] = element;
    }
  }

  public void addObjectWithFile(T element) {
    if (size == array.length) {
      int newSize = size + (size >> 1);
      T[] advancedArray = (T[]) new Object[newSize];
      System.arraycopy(array, 0, advancedArray, 0, size);
      array = advancedArray;
    } else {
      array[size++] = element;
    }
  }

  public void update(int index, T element) {
    array[index] = element;
  }

  public void delete(int index) {
    for (int i = index; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    size--;
  }

  public void printArray() {
    for (int i = 0; i < size; i++) {
      System.out.println(array[i]);
    }
  }

  public void replace(int startIndex, int finishIndex) {
    T intermediate = array[startIndex];
    array[startIndex] = array[finishIndex];
    array[finishIndex] = intermediate;
  }

  public void sort() {
    Arrays.sort(array);
    printArray();
  }

  // реализовать метод сохранения информации в файл
  public void saveObjectToFile() {
    String path="";
    FileWriter writer =null;
    try {
      writer = new FileWriter(path);
      for (int i=0; i<size; i++){
//        QUESTION. КАК МОЖНО ОБРАТИТЬСЯ К ПОЛЮ КОНРЕТНОГО ОБЪЕКТА, ЕСЛИ МЫ НЕ ЗНАЕМ ИХ КОЛИЧЕСТВО И НАЗВАНИЕ
//        РЕАЛИЗОВАТЬ ДАННЫЙ МЕТОД В КАЖДОМ КЛАССЕ ИЛИ РЕАЛИЗОВАТЬ В БАЗОВОМ КЛАССЕ И ПЕРЕОПРЕДЕЛИТЬ В НАСЛЕДНИКАХ
//        ИЛИ ЕСТЬ ДРУГОЕ ELEGANT SOLUTION?????
//        writer.write(name+mainComputerEquipment.getName+.........);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
