package hw5part3.servise;

import java.io.File;
import java.util.Scanner;

public class ScannerWrapper {

  private Scanner sc = new Scanner(System.in);

  public ScannerWrapper() {
  }

  public ScannerWrapper(File file) {
  }

  public String nextLine() {
    return sc.nextLine();
  }

  public boolean hasNextLine() {
    return sc.hasNextLine();
  }

  public int nextInt() {
    int result = sc.nextInt();
    sc.nextLine();
    return result;
  }

  public int nextInt(int from, int to) {
    int result = from - 1;
    while (result < from || result > to) {
      result = nextInt();
    }
    return result;
  }
}
