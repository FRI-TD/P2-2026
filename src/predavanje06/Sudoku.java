package predavanje06;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Sudoku {

  public static void main(String[] args) throws Exception {
    String imeDatoteke = "viri/sudoku.txt";

    Random rnd = new Random();
    // stevilo vrstic, ki jih preberem in zavrzem
    int n = rnd.nextInt(50); // med 0 in 49

    Scanner sc = new Scanner(new File(imeDatoteke));

    // preberem in zavržem n vrstic
    for(; n>0; n--)
      sc.nextLine();

    String vrstica = sc.nextLine();

    sc.close();

    System.out.println("-".repeat(37));
    System.out.print("| ");
    for(int i=0; i<81; i++) {
      char znak = vrstica.charAt(i);

      System.out.printf(" %c ", znak == '0' ? '.' : znak);

      if (i % 3 == 2) System.out.print(" | ");

      // if ((i+1) % 9 == 0) System.out.println();
      if (i % 9 == 8) {
        System.out.println();
        if (i%27 != 26) System.out.print("| ");
      }

      if (i % 27 == 26) {
        System.out.println("-".repeat(37));
        if (i<80) System.out.print("| ");
      }

    }

  }
}
