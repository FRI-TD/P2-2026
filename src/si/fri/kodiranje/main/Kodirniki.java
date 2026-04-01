package si.fri.kodiranje.main;

import org.apache.commons.codec.binary.Base64;

import java.util.Scanner;

public class Kodirniki {

  public static String kodirajXOR(String vsebina, String kljuc) {
    StringBuilder rezultat = new StringBuilder();
    for (int i = 0; i < vsebina.length(); i++) {
      char z = vsebina.charAt(i);
      char g = kljuc.charAt(i % kljuc.length());
      char zakodiran = (char) (z ^ g);
      rezultat.append(zakodiran);
    }
    return rezultat.toString();
  }

  public static String kodirajNUM(String vsebina) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < vsebina.length() ; i++) {
      sb.append(String.format("%d ", (int) vsebina.charAt(i)));
    }
    return sb.toString();
  }

  public static String kodirajBase64(String vsebina) {
    return new String(Base64.encodeBase64(vsebina.getBytes()));
  }

  public static String dekodirajXOR(String vsebina, String kljuc) {
    return kodirajXOR(vsebina, kljuc);
  }

  public static String dekodirajNUM_X(String vsebina) {
    StringBuilder sb = new StringBuilder();

    String[] deli = vsebina.split(" ");
    for (int i = 0; i <deli.length ; i++) {
      sb.append(String.format("%c", (char) Integer.parseInt(deli[i])));
    }
    return sb.toString();
  }

  public static String dekodirajNUM(String vsebina) {
    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(vsebina);
    while (sc.hasNextInt()) {
      sb.append((char) sc.nextInt());
    }
    sc.close();
    return sb.toString();
  }

  public static String dekodirajBase64(String vsebina) {
    return new String(Base64.decodeBase64(vsebina.getBytes()));
  }

}
