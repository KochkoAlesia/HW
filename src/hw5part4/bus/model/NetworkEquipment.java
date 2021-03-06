package hw5part3.bus.model;

public class NetworkEquipment extends MainComputerEquipment {

  private String form;

  public NetworkEquipment(String name, int price, int yearOfManufacture, String form) {
    super(name, price, yearOfManufacture);
    this.form = form;
  }

  public NetworkEquipment() {

  }

  public String getForm() {
    return form;
  }

  public void setForm(String form) {
    this.form = form;
  }

  @Override
  public String toString() {
    return "NetworkEquipment{" +
        "form='" + form + '\'' +
        '}';
  }
}
