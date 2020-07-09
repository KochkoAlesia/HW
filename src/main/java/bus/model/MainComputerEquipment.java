package bus.model;

import java.io.Serializable;

public class MainComputerEquipment<T> implements Comparable<MainComputerEquipment<T>>, Serializable {

  private String name;
  private int price;
  private int yearOfManufacture;

  public MainComputerEquipment(String name, int price, int yearOfManufacture) {
    this.name = name;
    this.price = price;
    this.yearOfManufacture = yearOfManufacture;
  }

  public MainComputerEquipment() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getYearOfManufacture() {
    return yearOfManufacture;
  }

  public void setYearOfManufacture(int yearOfManufacture) {
    this.yearOfManufacture = yearOfManufacture;
  }

  @Override
  public String toString() {
    return "MainComputerEquipment{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", yearOfManufacture=" + yearOfManufacture +
        '}';
  }

  @Override
  public int compareTo(MainComputerEquipment<T> o) {
    return String.valueOf(name).compareTo(String.valueOf(o.getName()));
  }
}
