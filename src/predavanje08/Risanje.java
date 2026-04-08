package predavanje08;

import edu.princeton.cs.algs4.StdDraw;
import java.awt.Color;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Risanje {

  static void tarca() {
    StdDraw.setScale(-1,1);
    StdDraw.clear(Color.black);

    StdDraw.setPenColor(Color.yellow);
    StdDraw.setPenRadius(0.01);
    for (int i = 0; i < 10 ; i++) {
      StdDraw.circle(0,0, 0.1 + 0.1*i);
    }

    StdDraw.setPenColor(Color.red);
    StdDraw.text(0,0, "(0,0)");
  }

  static void barvniKvadrat(){
    StdDraw.setScale(0,100);

    for (int i = 0; i < 25; i++) {
      for (int j = 0; j < 25; j++) {
        StdDraw.setPenColor(new Color(10*i, 10*j, 0));
        StdDraw.filledRectangle(2 + i*4, 2+j*4, 2, 2);
      }

    }
  }

  static void kvadratnaSpirala() {
    StdDraw.setScale(-100,100);
    int d = 1; // dolzina premika
    int deltaD = 1;

    int[][] smeri = {{0,-1}, {-1,0}, {0,1}, {1,0}};
    int trSmer    = 0;

    int trX = 0, trY = 0;
    int nX, nY;

    while (Math.max(Math.abs(trX), Math.abs(trY)) < 100) {
      int[] smer = smeri[trSmer]; // ena od {0,-1}, {-1,0}, {0,1}, {1,0}
      nX = trX + smer[0] * d;
      nY = trY + smer[1] * d;

      StdDraw.line(trX, trY, nX, nY);

      trX = nX;
      trY = nY;

      d += deltaD;
      trSmer = (trSmer + 1) % 4;
    }
  }

  static void roza(int n) {
    StdDraw.setScale(-100,100);

    double kot = Math.toRadians(360 / n);  // notranji kot v n-kotniku

    double d = 20;

    double trX=0, trY=0;
    double nX, nY;

    double trSmer = 0;

    for (int j=0; j<n; j++) {
      for (int i = 0; i < n; i++) {
        nX = trX + (i==n-1 ? 2.5 : 1) * d * Math.cos(trSmer);
        nY = trY + (i==n-1 ? 2.5 : 1) * d * Math.sin(trSmer);

        if (i!=n-1)
          trSmer += kot;

        StdDraw.line(trX, trY, nX, nY);
        trX = nX;
        trY = nY;
      }
    }
  }

  static void spirala() {
    StdDraw.setScale(-100,100);
    //StdDraw.setPenRadius(0.01);
    double kot = 0;
    double deltaKot = Math.toRadians(2);

    double d = 1;
    double deltaD = 1.008;

    double trX=0, trY=0, nX, nY;

    for (int i = 0; i < 1000; i++) {
      nX = d * Math.cos(kot);
      nY = d * Math.sin(kot);

      StdDraw.line(trX, trY, nX, nY);
      trX = nX; trY = nY;

      kot = kot + deltaKot;
      d   = d * deltaD;
    }
  }

  static void kazalec(double kot, double dolzina, double debelina) {
    StdDraw.setPenRadius(debelina);
    double x = dolzina * Math.cos(kot);
    double y = dolzina * Math.sin(kot);

    StdDraw.line(0,0,x,y);
  }

  static void radar() {
    StdDraw.setScale(-100,100);
    StdDraw.setPenRadius(0.01);

    StdDraw.enableDoubleBuffering();

    double kot = 0;
    while (true) {
      StdDraw.clear(Color.black);
      StdDraw.setPenColor(Color.green);

      for (int i = 20; i <=80 ; i=i+20) {
        StdDraw.circle(0,0,i);
      }
      kazalec(Math.toRadians(kot), 80, 0.01);
      kot += 1;

      StdDraw.show();
      //StdDraw.pause(100);
    }
  }

  static void ura() {
    StdDraw.setScale(-100,100);
    StdDraw.enableDoubleBuffering();

    int kSec = 360 / 60;
    int kMin = 360 / 60;
    int kUra = 360 / 12;

    while (true) {
      StdDraw.clear();

      String cas = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      String[] casDeli = cas.split(":");
      int ura = Integer.parseInt(casDeli[0]) % 12;
      int min = Integer.parseInt(casDeli[1]);
      int sec = Integer.parseInt(casDeli[2]);

      StdDraw.text(-80, 90, cas);

      double kot = 60;
      for (int i = 1; i <= 12 ; i++) {
        double x = 95 * Math.cos(Math.toRadians(kot));
        double y = 95 * Math.sin(Math.toRadians(kot));
        StdDraw.text(x,y,i+"");
        kot = kot - 30;
      }


      for (int i = 0; i < 60 ; i++) {
        double kkot = Math.toRadians(i*6);
        double xR = Math.cos(kkot);
        double yR = Math.sin(kkot);
        StdDraw.setPenRadius(0.004*(i%5==0 ? 2.5 : 1));
        StdDraw.line(xR*85, yR*85, xR*90, yR*90);
      }

      double sKot = Math.toRadians(90 - (sec * kSec));
      kazalec(sKot, 90, 0.001);

      double mKot = Math.toRadians(90 - ((min+sec/60.0) * kMin));
      kazalec(mKot, 85, 0.01);

      double uKot = Math.toRadians(90 - (ura * kUra));
      kazalec(uKot, 70, 0.02);


      StdDraw.show();
    }
  }

  public static void main(String[] args) {
    // tarca();
    // barvniKvadrat();
    //kvadratnaSpirala();

    //roza(6);

    //spirala();

    //radar();

    ura();
  }
}
