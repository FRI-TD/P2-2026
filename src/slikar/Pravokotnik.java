package slikar;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Pravokotnik extends Lik {
  double a;
  double b;

  public Pravokotnik(double x, double y, double a, double b, Color barva) {
    super(x, y, barva);
    this.a = a;
    this.b = b;
  }

  @Override
  void narisiSe() {
    StdDraw.filledRectangle(x,y,a/2,b/2);
  }

  @Override
  void spremeniVelikost(int delta) {
    this.a +=delta;
    this.b +=delta;
  }
}
