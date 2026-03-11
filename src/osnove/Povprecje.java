package osnove;

import java.util.Scanner;

public class Povprecje {

  public static void main(String[] args) {
    int n = 0;     // stevilo do sedaj vpisanih ocen
    int vsota = 0; // vsota do sedaj vpisanih ocen

    int x = -1; // trenutna ocena

    Scanner sc = new Scanner(System.in);

    do {
      System.out.print("Vpisi oceno: ");

      try {
        x = sc.nextInt();
      } catch (Exception e) {
        // kaj naj se zgodi, če je pri ukazih v try bloku prišlo do izjeme
        System.out.println("Prosim, vnesi število!");
        sc.nextLine();
        continue;
      }

      if (x != 0) {
        n++;
        vsota = vsota + x;
      }
    } while(x != 0);

    //double povprecje = (double) vsota / n;

    if (n>0) {
      double povprecje = 1.0 * vsota / n;
      System.out.printf("osnove.Povprecje %d prebranih ocen je %.2f\n", n, povprecje);
    } else {
      System.out.println("Ni bilo vpisanih ocen!");
    }
  }
}
