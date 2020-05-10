package hw5part3.bus.model;

public class Computer extends MainComputerEquipment {

  private String brand;
  private int numberOfCores;

  public Computer(String name, int price, int yearOfManufacture, String brand, int numberOfCores) {
    super(name, price, yearOfManufacture);
    this.brand = brand;
    this.numberOfCores = numberOfCores;
  }

  public Computer() {
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getNumberOfCores() {
    return numberOfCores;
  }

  public void setNumberOfCores(int numberOfCores) {
    this.numberOfCores = numberOfCores;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "brand='" + brand + '\'' +
        ", numberOfCores=" + numberOfCores +
        '}';
  }
}
