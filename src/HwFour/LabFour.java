package HwFour;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

public class LabFour {

  public static void main(String[] args) {

//  зад 20. Отред-ть заданное предложение, удаляя из него слова, кот. встречаются в предложении n раз.

    String s2;
    s2 = "Тестовая строка, используемая для разложения на слова";
    StringTokenizer st1 = new StringTokenizer(s2, " \t\n\r,.");
    while (st1.hasMoreTokens()) {
      // Выводим лексемы в консоль
      System.out.println(st1.nextToken());
      String strings1 = st1.nextToken();
    }




    String input = "I love the sea I'm going to the sea I can swim in the sea What a clear sea I want to go to the sea Tomorrow we will go to the sea";
    String [] strings = input.split("\\.?,?\\s");
        int countRepeat =0;
    int n=2;
    for (int i=0; i<strings.length; i++){
    }

    String str = "hello hello world world world world";
    String pat = "\\b(\\w+)(?:\\s+\\1\\b)+";
    String res = str.replaceAll(pat, "$1");
    System.out.println(res);

    String fio = "Ivanov Ivan Ivanovich";
    String[] split = fio.split(" ");
    for (int i = 0; i < split.length; i++) {
      System.out.println(split[i]);
    }


    String s1 = "  asdQWE123  ";

    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());

    String substring = s1.substring(2, 4);
    System.out.println(substring);

    System.out.println(s1.trim());

    System.out.println(s1.contains("as"));

    System.out.println(s1.replaceAll("[0-9]", "Z"));

    String result = "";
    for (int i = 0; i < 10; i++) {
      result = result + i;
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      builder.append(i);
    }

    System.out.println(result);
    System.out.println(builder.toString());}

  public void findDupicateInArray(int[] a) {
    int count=0;
    for(int j=0;j<a.length;j++) {
      for(int k =j+1;k<a.length;k++) {
        if(a[j]==a[k]) {
          count++;
        }
      }
      if(count==1)
        System.out.println(a[j]);
      count = 0;
    }
  }
}


