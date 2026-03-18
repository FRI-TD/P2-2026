package operatorji;

public class Znaki {

  public static void main(String[] args) {
    char c = '\u03c0';
    char c1 = '\u0061';
    char nl = '\n';

    int x = 005;
    int y = 0b101010;
    int z = 100;

    System.out.println(c);
    System.out.println(c1);
    System.out.println(y);

    String imeDatoteke = "podatki.txt";
    if (imeDatoteke.endsWith(".txt")) {
      // to so tekstovni podatki
    } else if (imeDatoteke.endsWith(".gif")) {
      // slika
    }

    int pos = imeDatoteke.indexOf(".txt");
    System.out.println(pos);

    pos = imeDatoteke.indexOf(".gif"); // -1
    System.out.println(pos);

    String niz = imeDatoteke.substring(3,5);
    System.out.println(niz);

    imeDatoteke = imeDatoteke.replace(".txt", ".gif");
    System.out.println(imeDatoteke);

    imeDatoteke = "abcgifpodatki.gif";
    imeDatoteke = imeDatoteke.replaceAll("[.c]gif", ".exe");
    System.out.println(imeDatoteke);
  }
}
