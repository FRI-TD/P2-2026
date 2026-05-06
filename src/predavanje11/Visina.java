package predavanje11;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Visina {

  static ArrayList<Oseba> preberiOsebe(String imeDatoteke) throws Exception {
    ArrayList<Oseba> osebe = new ArrayList();

    Scanner sc = new Scanner(new File(imeDatoteke));
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      String[] deli = vrstica.split(":");
      Oseba o = new Oseba(deli[0], Integer.parseInt(deli[1]));
      osebe.add(o);
    }
    sc.close();
    return osebe;
  }

  public static void main(String[] args) throws Exception {
    ArrayList<Oseba> osebe = preberiOsebe("viri/visine.txt");
    for (Oseba oseba: osebe) {
      System.out.println(oseba);
    }

    System.out.println("Tretja oseba na seznamu: " + osebe.get(2));
  }
}
