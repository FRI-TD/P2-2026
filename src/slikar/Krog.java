package slikar;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Krog extends Lik {

  double r;

  Krog(double x, double y, double r, Color barva) {
    super(x,y,barva);
    this.r = r;
  }

  @Override
  void narisiSe() {
    StdDraw.filledCircle(this.x, this.y, this.r);
  }

  @Override
  void spremeniVelikost(int delta) {
    this.r += delta;
  }
}
