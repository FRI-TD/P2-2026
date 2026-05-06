package predavanje11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class MojPrimerjalnik implements Comparator<Oseba> {
  @Override
  public int compare(Oseba o1, Oseba o2) {
    // primerjava oseb po abecedi
    return o1.ime.compareTo(o2.ime);
  }
}

public class UrejanjeOseb {

  public static void main(String[] args) throws Exception {
    ArrayList<Oseba> osebe = Visina.preberiOsebe("viri/visine.txt");

    // urejanje po vrstnem redu, kot določa metoda
    // compareTo v razredu Oseba
    Collections.sort(osebe);

    for (Oseba o: osebe)
      System.out.println(o);

    // urejanj, kot določa primerjalnik
    MojPrimerjalnik primerjalnik = new MojPrimerjalnik();
    Collections.sort(osebe, primerjalnik);
    System.out.println("------------------------------");
    System.out.println("Urejeno po abecedi");
    for (Oseba o: osebe)
      System.out.println(o);

    Collections.sort(osebe, new Comparator<Oseba>() {
      @Override
      public int compare(Oseba o1, Oseba o2) {
        if (o1.ime.equals(o2.ime))
          return o2.visina - o1.visina;
        else return o1.ime.compareTo(o2.ime);
      }
    });
    System.out.println("Urejeno po abecedi in visini");
    for (Oseba o: osebe)
      System.out.println(o);



  }
}
