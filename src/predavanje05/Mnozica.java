package predavanje05;

public class Mnozica {

  static int getPraznaMnožica() {
    return 0;
  }

  // pretvorba znaka v pripadajočo vrednost
  // 'a' -> 1, 'b' -> 2, 'c' -> 4, 'd' -> 8, ....
  static int bit(char c) {
    return 1 << (c - 'a');
  }

  static int dodajElement(int mnozica, char znak) {
    return mnozica | bit(znak);
  }

  static int dodajElemente(int mnozica, char... znaki) {
    for(int i=0; i<znaki.length; i++) {
      mnozica = dodajElement(mnozica, znaki[i]);
    }
    return mnozica;
  }

  static int dodajElemente(int mnozica, char znaki) {
    return 0;
  }

  // vrne true, ce je c v mnozici, false sicer
  static boolean jeElement(int mnozica, char c) {
    return ((mnozica & bit(c)) != 0);
  }

  static String toString(int mnozica) {
    String result = "";
    for(char c='a'; c <= 'z'; c++) {
      if (jeElement(mnozica, c))
        result += (result.isEmpty() ? "" : ", ") + c;
    }
    return "[" + result + "]";
  }


  static int presek(int m1, int m2) {
    return m1 & m2;
  }

  static int unija(int m1, int m2) {
    return m1 | m2;
  }
    public static void main(String[] args) {
    int mnozica1 = getPraznaMnožica();

    mnozica1 = dodajElemente(mnozica1, 'a', 'e', 'b','z');
    System.out.printf("Mnozica1=%s\n", toString(mnozica1));

    int mnozica2 = getPraznaMnožica();
    mnozica2 = dodajElemente(mnozica2, 'a', 'f','z', 'b');
    System.out.printf("Mnozica2=%s\n", toString(mnozica2));

    int presek = presek(mnozica1, mnozica2);

    int unija  = unija (mnozica1, mnozica2);
    System.out.printf("presek(%s, %s)=%s\n",
            toString(mnozica1), toString(mnozica2), toString(presek));
    System.out.printf("unija (%s, %s)=%s\n",
            toString(mnozica1), toString(mnozica2), toString (unija));

  }
}
