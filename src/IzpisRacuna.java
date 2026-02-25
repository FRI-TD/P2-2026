public class IzpisRacuna {
  public static void main(String[] args) {
    // x = 5, y = 7,   ->  5 + 7 = 12

    int x = 5;
    int y = 17;

    System.out.printf("%d + %d = %d \n", x, y, x+y);
/*
    System.out.println(x + " + " + y + " = " + (x+y));

    String rezultat = String.format("%d + %d = %d \n", x, y, x+y);
    System.out.println(rezultat);
*/

    // izpis na 5 mest
    System.out.printf("%5d + %5d = %5d \n", x, y, x+y);
    System.out.printf("%-5d + %-5d = %-5d \n", x, y, x+y);
    System.out.printf("%05d + %05d = %05d \n", x, y, x+y);


    double pi = 3.1415926535; // Math.PI
    System.out.printf("Pi = %f \n", pi);
    System.out.printf("Pi = %.3f \n", pi);
    System.out.printf("Pi = %.20f \n", pi);
    System.out.printf("Pi = '%10.3f' \n", pi); // izpis na 10 mest, 3 decimalke
    System.out.printf("Pi = '%-10.3f' \n", pi); // izpis na 10 mest, 3 decimalke
    System.out.printf("Pi = '%2.3f' \n", pi); // izpis na 10 mest, 3 decimalke

    int m = 42;
    System.out.printf("m(10) = %d\n", m);
    System.out.printf("m( 8) = %o\n", m);
    System.out.printf("m(16) = %x\n", m);
    System.out.printf("m(16) = %X\n", m);


  }
}
