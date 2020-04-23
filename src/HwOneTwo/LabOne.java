package HwOneTwo;

import java.util.Arrays;
import java.util.Scanner;

public class LabOne {

  public static void main(String[] args) {

    // lab 1  var 20
    Scanner in = new Scanner(System.in);
    double x, a, b, u, result;

    System.out.print("Enter the number x ");
    x = in.nextDouble();
    System.out.print("Enter the beginning of the segment ");
    a = in.nextDouble();
    System.out.print("Enter the end of the segment ");
    b = in.nextDouble();
    System.out.print("Enter the parameter u ");
    u = in.nextDouble();

    if (x < a) {
      if (x != 0) {
        double someVariable = x + u / (5 * x);
        result = Math.log(someVariable);
      } else {
        System.out.println("x = 0 !");
        return;
      }
    } else if (x >= a && x <= b) {
      result = Math.pow(Math.E, -x) / (x - 10 * u);
    } else {
      double someVar = -u * x + 5;
      result = Math.log(someVar);
    }
    System.out.println(result);
    }
}
