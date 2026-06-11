package predavanja14;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tecaj {
  static String urlFormat = "https://min-api.cryptocompare.com/data/price?fsym=%s&tsyms=%s";

  public static void main(String[] args) {
    try {
      URL url = new URL(String.format(urlFormat, "BTC", "USD"));
      Scanner sc = new Scanner(url.openStream());
      String rezultat = sc.nextLine();
      sc.close();

      System.out.println(rezultat);

//      Scanner s2 = new Scanner(rezultat);
//      s2.useDelimiter("[:}]");
//      s2.next();
//      System.out.println(s2.nextDouble());

      String[] deli = rezultat.split(":");
      deli[1]=deli[1].replaceAll("}", "");
      System.out.println(deli[1]);

      Pattern pat = Pattern.compile("\\d+\\.\\d+");
      Matcher m = pat.matcher(rezultat);
      if (m.find())
        System.out.println("Vrednost: " + m.group(0));

    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }
}
