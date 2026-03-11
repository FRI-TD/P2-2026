package operatorji;

public class Biti {

  static int steviloBitov(int x) {
    int rezultat = 0;

    while (x != 0) {
      // pogledam zadnji bit
      if ((x & 1) == 1) rezultat++;

      // premaknemo bite stevila x v desno
      x = x >> 1;
    }

    return rezultat;
  }

  public static void main(String[] args) {
    int n = 255;
    System.out.printf("Stevilo prizganih bitov v stevilu %d je %d\n", n, steviloBitov(n));
  }
}
