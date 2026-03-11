package operatorji;

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

  public static void main(String[] args) {
    int mnozica1 = getPraznaMnožica();

    mnozica1 = dodajElement(mnozica1, 'a');
    mnozica1 = dodajElement(mnozica1, 'd');
    System.out.println(mnozica1);

    //mnozica1 = dodajElement(mnozica1, 'a','i', 'e', 'z');


    // System.out.printf("Mnozica1=%s\n", toString(mnozica1));

//    int mnozica2 = getPraznaMnožica();
//    mnozica2 = dodajElement(mnozica2, 'a', 'f','z', 'b');
//    System.out.printf("Mnozica2=%s\n", toString(mnozica2));
//
//    int presek = presek(mnozica1, mnozica2);
//    int unija  = unija (mnozica1, mnozica2);
//    System.out.printf("presek(%s, %s)=%s\n",
//            toString(mnozica1), toString(mnozica2), toString(presek));
//    System.out.printf("inija (%s, %s)=%s\n",
//            toString(mnozica1), toString(mnozica2), toString (unija));

  }
}
