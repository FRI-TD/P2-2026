package predavanja14;

import java.net.URL;
import java.util.Scanner;

public class Vreme {

  public static void main(String[] args) {
    try {
      URL url = new URL("https://meteo.arso.gov.si/");
      Scanner sc = new Scanner(url.openStream());
      sc.useDelimiter("\\A");
      System.out.println(sc.next());
      sc.close();

    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }
}
