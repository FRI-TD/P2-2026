package predavanja13;

import java.io.*;
import java.util.ArrayList;

public class Imenik {

  static ArrayList<Oseba> ustvariImenik() {
    ArrayList<Oseba> osebe = new ArrayList();
    osebe.add(new Oseba("Janez", "Novak", "Ljubljanska 25", "041123456"));
    osebe.add(new Oseba("Micka", "Hočevar", "Lepi pot 13", "040987654"));
    osebe.add(new Oseba("Tadej", "Podgoričnik", "Podgorica 42", "015152534"));
    return osebe;
  }

  static void izpisi(ArrayList<Oseba> osebe) {
    System.out.println("Osebe v imeniku:");
    for(Oseba o : osebe)
      System.out.println(o);
  }

  static void zapisiVDatoteko(ArrayList<Oseba> osebe) {
    try {
      File f = new File("viri/imenik.bin");
      FileOutputStream fis = new FileOutputStream(f);
      BufferedOutputStream bis = new BufferedOutputStream(fis);
      ObjectOutputStream oos = new ObjectOutputStream(bis);

      for(Oseba o: osebe)
        oos.writeObject(o);

      oos.close(); // dovolj?
      bis.close();
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }

  static ArrayList<Oseba> preberiOsebe() {
    ArrayList<Oseba> osebe = new ArrayList<>();
    File f = new File("viri/imenik.bin");

    FileInputStream fis = null;
    ObjectInputStream oos = null;

    try {
      fis = new FileInputStream(f);
      oos = new ObjectInputStream(fis);

      while (true) {
        Oseba o = (Oseba) oos.readObject();
        osebe.add(o);
      }
    } catch (EOFException e) {
      // ne naredimo niceasr, saj je to pričakovana napaka
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    } finally {
      try {
        oos.close();
      } catch (Exception e) {
        System.out.println("Napaka pri zapiranju");
      }
    }
    return osebe;
  }

  public static void main(String[] args) {
    //ArrayList<Oseba> osebe = ustvariImenik();
    //zapisiVDatoteko(osebe);

    ArrayList<Oseba> osebe = preberiOsebe();
    izpisi(osebe);

  }
}
