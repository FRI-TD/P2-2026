package predavanje12;

public class Izjema {

  static void napaka() {
    int a = 0;
    try {
      int x = 10 / a;
    } catch (ArithmeticException e) {
      System.err.println("Napaka: " + e.getMessage());
      System.err.println("Napaka: " + e.toString());

      e.printStackTrace();
    }
    System.out.println("Se vedno sem živ");
  }
  public static void main(String[] args) {
    napaka();

    int y = 10/0;

    int[] tab = {1,2,3};
    tab[5] = 5;
  }
}
