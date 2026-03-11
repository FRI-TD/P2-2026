package osnove;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Bikojn {

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(new File("viri/bitcoin.txt"));

    /*
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine(); // preberem ...
      System.out.println(vrstica); // .. in izpisem vse vrstice
    }
    */

    Locale.setDefault(Locale.ENGLISH);

    double min = Double.MAX_VALUE;
    double max = 0;

    String minD="", maxD="";

    while (sc.hasNext()) {
      String datum = sc.next();

      // if (!sc.hasNextDouble()) break;
      // double vrednost = sc.nextDouble();

      String vrednostD = sc.next();
      double vrednost = Double.parseDouble(vrednostD);

      if (vrednost < min) {
        min = vrednost;
        minD = datum;
      }

      if (vrednost > max) {
        max = vrednost;
        maxD = datum;
      }

      System.out.println(vrednost);
    }

    sc.close();

    Locale.setDefault(Locale.of("SL", "SI"));


    System.out.printf("MIN: %.2f, datum: %s\n", min, minD);
    System.out.printf("MAX: %.2f, datum: %s\n", max, maxD);
  }
}
