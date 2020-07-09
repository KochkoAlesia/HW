package bus.model;

public class NetworkEquipment<T> extends MainComputerEquipment<T> {

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
        '}' + super.toString();
  }
}
