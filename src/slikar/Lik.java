package slikar;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.Color;

abstract public class Lik {
  // položaj centra
  double x;
  double y;
  Color barva;

  public Lik(double x, double y, Color barva) {
    this.x = x;
    this.y = y;
    this.barva = barva;
  }

  abstract void narisiSe();
  abstract void spremeniVelikost(int delta);

  void narisi() {
    StdDraw.setPenColor(this.barva);
    narisiSe();
  }

  void premakni(int deltaX, int deltaY) {
    this.x += deltaX;
    this.y += deltaY;
  }
}
