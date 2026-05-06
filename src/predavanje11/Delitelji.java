package predavanje11;

import java.util.HashSet;
import java.util.TreeSet;

public class Delitelji {

  static TreeSet<Integer> getDelitelji(int x) {
    TreeSet<Integer> rezultat = new TreeSet();
    rezultat.add(1);rezultat.add(x);

    for(int i=2; i<=x/2; i++)
      if (x % i == 0)
        rezultat.add(i);
    return rezultat;
  }

  public static void main(String[] args) {
    int a = 42;
    int b = 35;

    TreeSet<Integer> da = getDelitelji(a);
    TreeSet<Integer> db = getDelitelji(b);

    System.out.printf("Delitelji stevila %d: %s\n", a, da);
    System.out.printf("Delitelji stevila %d: %s\n", b, db);

    // presek
    TreeSet<Integer> presek = new TreeSet(da);  // presek vsebuje vse elemente da
    presek.retainAll(db);                       // obdrzi elemente, ki so tudi v db
    System.out.printf("Delitelji stevil %d in %d: %s\n", a, b, presek);

    // unija
    TreeSet<Integer> unija = new TreeSet(da);  // unija vsebuje vse elemente da
    unija.addAll(db);                      // doda elemente, ki so v db
    System.out.printf("Delitelji stevil %d ali %d: %s\n", a, b, unija);

  }
}
