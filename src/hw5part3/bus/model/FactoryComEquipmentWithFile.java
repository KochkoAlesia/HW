package HwFivePartThree.bus.model;

import HwFivePartThree.servise.GenericFactory;
import HwFivePartThree.servise.ScannerWrapper;
import java.io.File;

public class FactoryComEquipmentWithFile implements GenericFactory<MainComputerEquipment> {

  String path = null;
  ScannerWrapper sc = new ScannerWrapper();
  ScannerWrapper scannerWrapper = new ScannerWrapper();

  @Override
  public MainComputerEquipment produce() {

    System.out.println("Enter 1 to produce Computer");
    System.out.println("Enter 2 to produce Computer Peripherals");
    System.out.println("Enter 3 to produce Network Equipment ");

    int choice = sc.nextInt(1, 3);

    MainComputerEquipment result = null;

    switch (choice) {
      case 1:
        Computer computer = new Computer();
        System.out.println("Enter path");
        try {
          scannerWrapper = new ScannerWrapper(new File(path));
          while (scannerWrapper.hasNextLine()) {
            String string = scannerWrapper.nextLine();
            String[] strings = string.split(",");
            computer.setName(strings[0]);
            computer.setPrice(Integer.parseInt(strings[1]));
            computer.setYearOfManufacture(Integer.parseInt(strings[3]));
            computer.setBrand(strings[4]);
            computer.setNumberOfCores(Integer.parseInt(strings[5]));
            result = computer;
          }
        } catch (NumberFormatException i) {
          System.out.println("Check the file");
        }
        break;
      case 2:
        ComputerPeripherals peripherals = new ComputerPeripherals();
        System.out.println("Enter path");
        try {
          scannerWrapper = new ScannerWrapper(new File(path));
          while (scannerWrapper.hasNextLine()) {
            String string = scannerWrapper.nextLine();
            String[] strings = string.split(",");
            peripherals.setName(strings[0]);
            peripherals.setPrice(Integer.parseInt(strings[1]));
            peripherals.setYearOfManufacture(Integer.parseInt(strings[3]));
            peripherals.setKind(strings[4]);
            result = peripherals;
          }
        } catch (NumberFormatException i) {
          System.out.println("Check the file");
        }
        break;
      case 3:
        NetworkEquipment networkEquipment = new NetworkEquipment();
        System.out.println("Enter path");
        try {
          scannerWrapper = new ScannerWrapper(new File(path));
          while (scannerWrapper.hasNextLine()) {
            String string = scannerWrapper.nextLine();
            String[] strings = string.split(",");
            networkEquipment.setName(strings[0]);
            networkEquipment.setPrice(Integer.parseInt(strings[1]));
            networkEquipment.setYearOfManufacture(Integer.parseInt(strings[3]));
            networkEquipment.setForm(strings[4]);
            result = networkEquipment;
          }
        } catch (NumberFormatException i) {
          System.out.println("Check the file");
        }
        break;
      default:
        return null;
    }
    System.out.println("File upload completed, the object is created");
    return result;
  }
}

