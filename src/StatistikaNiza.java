public class StatistikaNiza {

  public static void main(String[] args) {
    String niz = "Danes je lep dan!";

    System.out.println("Vpisani niz: " + niz);
    System.out.printf("Prva crka: %c\n", niz.charAt(0));

    int dolzina = niz.length();
    System.out.printf("Zadnja crka: %c\n", niz.charAt(dolzina - 1));

    String brezPresledkov = niz.replaceAll(" ", "");
    System.out.printf("Brez presledkov: %s\n", brezPresledkov);

    System.out.print("Brez presledkov: ");
    for (int i=0; i < niz.length(); i++) {
      if (niz.charAt(i) != ' ') {
        System.out.print(niz.charAt(i));
      }
    }
    System.out.println();

    System.out.printf("Stevilo besed: %d \n", niz.length() - brezPresledkov.length() + 1);

    System.out.print("Obrnjen niz: ");
    for (int i = niz.length()-1; i >= 0; i = i-1)
      System.out.print(niz.charAt(i));
    System.out.println();
  }

}
