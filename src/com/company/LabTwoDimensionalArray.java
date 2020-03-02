package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LabTwoDimensionalArray {

  public static void main(String[] args) {
      /* lab 2 var 20: Дана матрица A[n][n]. Сформировать вектор В из средних арифметических значений
       строк матрицы. Отсортировать вектор В по возрастанию */

    int a =0;
    Scanner in = new Scanner(System.in);
    System.out.print(" Enter the number of array elements : ");
    int m = in.nextInt();

    int[][] arrays = new int[m][m];
    int[] vec = new int[m];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print("Enter array element" + "" + "[" + (i) + "][" + (j) + "] = ");
        arrays[i][j] = in.nextInt();
      }
    }
    int sum = 0;
    for (int i = 0; i < arrays.length; i++) {
      for (int j = 0; j < arrays[i].length; j++) {
        sum = sum + arrays[i][j];
        a=a+1;
      }
      vec[i] = sum/a;
      sum = 0;
    }
    System.out.println(Arrays.toString(vec));

    for (int i = vec.length-1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (vec[j] > vec[j+1]) {
          int tmp = vec[j];
          vec[j] = vec[j+1];
          vec[j+1] = tmp;
        }
      }
    }

    System.out.println("Bubble sort "+ Arrays.toString(vec));

    Arrays.sort(vec);
    System.out.println("Method sort "+ Arrays.toString(vec));
  }
}