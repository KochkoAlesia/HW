package hw5part3.bus.model;

public class ComputerPeripherals extends MainComputerEquipment {
  private String kind;

  public ComputerPeripherals(String name, int price, int yearOfManufacture, String kind) {
    super(name, price, yearOfManufacture);
    this.kind = kind;
  }

  public ComputerPeripherals() {
   }

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  @Override
  public String toString() {
    return "ComputerPeripherals{" +
        "kind='" + kind + '\'' +
        '}';
  }
}
