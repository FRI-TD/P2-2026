package predavanje10;

class Polinom extends Funkcija {
  @Override
  double vrednost(double x) {
    return x*x*x-6*x*x+3*x+10;
  }

  @Override
  double odvod(double x) {
    return 3*x*x-12*x+3;
  }
}

public class Newton {

  static double nicla(double x0, Funkcija f, int n) {
    for (int i = 0; i < n; i++) {
      x0 = x0 - f.vrednost(x0) / f.odvod(x0);
    }
    return x0;
  }

  public static void main(String[] args) {
    Funkcija f = new Sinus();
    double x = nicla(2, f, 6);
    System.out.println(x);
    System.out.println(Math.PI);

    System.out.println("---------------");
    x = nicla(4, new Polinom(), 10);
    System.out.println(x);

    x = nicla(0, new Funkcija() {
      @Override
      double vrednost(double x) {
        return Math.exp(x)-2;
      }

      @Override
      double odvod(double x) {
        return Math.exp(x);
      }
    }, 10);
    System.out.println(x);
  }
}
