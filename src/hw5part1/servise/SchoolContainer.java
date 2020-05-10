package HwFivePartOne.servise;

import HwFivePartOne.bus.model.School;
import java.util.Arrays;

public class SchoolContainer {

  private School[] array = new School[1000];
  private int size = 0;

  public void add(School element) {
    if (size == array.length) {
      System.out.println("Массив переполнен");
    } else {
      array[size++] = element;
    }
  }

  public void update(int index, School element) {
    array[index] = element;
  }

  public void delete(int index) {
    for (int i = index; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    size--;
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.println(array[i]);
    }
  }

  public void averageAge() {
    int overallAge = 0;
    for (School school : array) {
      overallAge = overallAge + school.getAge();
    }
    double averageAge = overallAge % size;
  }

  public void sort() {
    Arrays.sort(array);
    print();
  }

  public int getSize() {
    return size;
  }
}
