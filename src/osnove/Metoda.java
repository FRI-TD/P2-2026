package osnove;

public class Metoda {
  // ni OK, ker void metoda ne sme ničesar vračati

  /*
  void sestej(int a, int b) {
    return a+b;
  }
  */

  // ni OK, ker manjka return
  /*
  int sestej(int a, int b) {
    System.out.println(a+b);
  }
  */

  static int sestej(int a, int b) {
    return a+b;
  }

  // ni OK, ker vrača int namesto String
  /*
  static String vsota(int a, int b) {
    return a+b;
  }
  */

  public static void main(String[] args) {
    int x = 5;
    int y = 6;
    int z = sestej(x,y);
    System.out.println(z);

    int c = sestej(10,20);
  }




}
