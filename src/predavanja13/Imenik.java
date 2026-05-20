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
    try (FileInputStream fis = new FileInputStream(f);
         ObjectInputStream dis = new ObjectInputStream(fis);)
    {
      do {
        Oseba o = (Oseba) dis.readObject();
        osebe.add(o);
      } while (true);
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
    return osebe;
  }

  public static void main(String[] args) {
    //ArrayList<Oseba> osebe = ustvariImenik();
    ArrayList<Oseba> osebe = preberiOsebe();
    izpisi(osebe);
    //zapisiVDatoteko(osebe);
  }
}
