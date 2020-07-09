package bus.model;


import servise.GenericFactory;
import servise.ScannerWrapper;

public class FactoryComEquipment implements GenericFactory<MainComputerEquipment<?>> {

  private ScannerWrapper sc = new ScannerWrapper();

  @Override
  public MainComputerEquipment<?> produce() {
    System.out.println("Enter 1 to produce Computer");
    System.out.println("Enter 2 to produce Computer Peripherals");
    System.out.println("Enter 3 to produce Network Equipment ");

    int choice = sc.nextInt(1, 3);

    MainComputerEquipment<?> result;

    switch (choice) {
      case 1:
        Computer computer = new Computer();
        System.out.println("Enter the computer's brand");
        String brand = sc.nextLine();
        computer.setBrand(brand);
        System.out.println("Enter the computer's number of cores");
        int numberOfCores = sc.nextInt();
        computer.setNumberOfCores(numberOfCores);
        result = computer;
        break;
      case 2:
        ComputerPeripherals peripherals = new ComputerPeripherals();
        System.out.println("Enter the kind peripherals");
        String kind = sc.nextLine();
        peripherals.setKind(kind);
        result = peripherals;
        break;
      case 3:
        NetworkEquipment networkEquipment = new NetworkEquipment();
        System.out.println("Enter the form  network equipment");
        String form = sc.nextLine();
        networkEquipment.setForm(form);
        result = networkEquipment;
        break;
      default:
        return null;
    }

    System.out.println("Enter brand");
    String name = sc.nextLine();
    result.setName(name);

    System.out.println("Enter price");
    int price = sc.nextInt();
    result.setPrice(price);

    System.out.println("Enter year produce");
    int year = sc.nextInt();
    result.setYearOfManufacture(year);
    return result;
  }
}
