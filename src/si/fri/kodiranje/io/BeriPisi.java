package si.fri.kodiranje.io;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class BeriPisi {
  public static String preberiDatoteko(String imeDatoteke) {
    try {
      StringBuilder sb = new StringBuilder();
      Scanner sc = new Scanner(new File(imeDatoteke));
      while(sc.hasNextLine()) {
        String vrstica = sc.nextLine();
        if (!sb.isEmpty()) sb.append("\n");
        sb.append(vrstica);
      }
      sc.close();

      return sb.toString();
    } catch (Exception e) {
      // ce pride do napake
      System.out.println("Napaka pri branbju datoteke");
      return "";
    }
  }

  public static void zapisiDatoteko(String imeDatoteke, String vsebina) {
    try {
      PrintWriter pw = new PrintWriter(imeDatoteke);
      pw.print(vsebina);
      pw.close();
    } catch (Exception e) {
      System.out.println("Napaka pri pisanju v datoteko!");
    }
  }
}
