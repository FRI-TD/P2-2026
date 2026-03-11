package osnove;

import java.util.Random;

public class Nakljucje {

  public static void main(String[] args) {
    Random rnd = new Random();  // nov generator naključnih števil

    double x = rnd.nextDouble();
    System.out.println(x);
  }

}
