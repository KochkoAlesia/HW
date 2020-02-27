package com.company;

import java.util.Scanner;

public class LabTwo {

   public static void main(String[] args) {
     // lab 2 var 20: Дан массив A[n]. Найти среднее арифметическое элементов массива, кратных заданному числу k.

    Scanner in = new Scanner(System.in);
    int n, k;
    int sum = 0;

    System.out.print("Enter the number of array elements :");
    n = in.nextInt();

    while (n <= 0) {
      System.out.print(
          "The size of the array is not correct. Enter the number of array elements one more time");
      n = in.nextInt();
    }

    System.out.print("Enter the number k :");
    k = in.nextInt();

    if (k == 0) {
      System.out.print("Invalid input. Enter the number k one more time");
      n = in.nextInt();
    }

    int mas[] = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter " + i + " array element:");
      mas[i] = in.nextInt();

      if (mas[i] % k == 0) {
        sum = sum + mas[i];
      }
    }

    System.out.print("The sum of the array elements is a multiple of " + k + " = " + sum);
    System.out.println("");
  }
}
