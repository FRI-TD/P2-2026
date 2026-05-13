package predavanje12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Drzave {

  static HashMap<String, Drzava> preberiDrzave(String imeDatoteke) throws FileNotFoundException {
    HashMap<String, Drzava> result = new HashMap();
    Scanner sc = new Scanner(new File(imeDatoteke));
    while (sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      String[] deli = vrstica.split(":");
      if (deli.length == 3) {
        long steviloPrebivalcev = 0;

        try {
          steviloPrebivalcev = Long.parseLong(deli[2]);
        } catch (NumberFormatException e) {
          System.err.println("Napaka pri stevilu prebivalcev drzave " + deli[0]);
        }
        Drzava drzava = new Drzava(deli[0], deli[1], steviloPrebivalcev);
        result.put(deli[0], drzava);
      }
    }
    sc.close();
    return result;
  }

  public static void main(String[] args) throws FileNotFoundException {
    HashMap<String, Drzava> drzave = preberiDrzave("viri/drzave.txt");

    Scanner tipkovnica = new Scanner(System.in);
    System.out.print("Vpisi kratico svoje drzave: ");
    String kratica = tipkovnica.next();

    if (drzave.containsKey(kratica.toUpperCase()))
      System.out.printf("Tvoja drzava ima %d prebivalcev\n",
        drzave.get(kratica.toUpperCase()).getSteviloPrebivalcev());
    else
      System.out.println("Tvoje drzave ne poznam.");

    TreeSet<Drzava> urejeneDrzave = new TreeSet<>(drzave.values());
    for(Drzava d : urejeneDrzave)
      System.out.println(d);

    ArrayList<String> kratice = new ArrayList(drzave.keySet());
    kratice.sort(new Comparator<String>() {
      public int compare(String o1, String o2) {
        Drzava d1 = drzave.get(o1);
        Drzava d2 = drzave.get(o2);
        return Long.compare(d1.getSteviloPrebivalcev(), d2.getSteviloPrebivalcev());
      }
    });
    System.out.println("----------------------------------");
    for (String k : kratice) {
      System.out.println(drzave.get(k));
    }
  }
}
