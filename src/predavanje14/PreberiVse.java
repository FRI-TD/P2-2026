package predavanja14;

import java.io.File;
import java.util.Scanner;

public class PreberiVse {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new File("viri/bitcoin.txt"));
    sc.useDelimiter("\\A");
    String vsebina = sc.next(); // preberem celotno datoteko
    System.out.println(vsebina);

    String podatki = "Miha 20 60,5";
    Scanner s = new Scanner(podatki);
    System.out.println("Ime: " + s.next());
    System.out.println("Starost: " + s.nextInt());
    System.out.printf("Teža: %.2f \n",s.nextDouble());
  }
}
