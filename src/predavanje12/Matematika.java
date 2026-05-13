package predavanje12;

public class Matematika {

  static double Tan(double x) {
    if (Math.cos(x) == 0)
      throw new NapacenArgument();
    else
      return Math.sin(0) / Math.cos(x);
  }

  public static void main(String[] args) {
    double x = Tan(Math.PI / 2);
  }
}
