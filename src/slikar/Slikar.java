package slikar;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Slikar {

  public static void main(String[] args) {
    StdDraw.setScale(0,100);

    int stLikov = 0;
    Lik[] liki  = new Lik[10];

    liki[stLikov++] = new Krog(50,50, 10, Color.red);
    liki[stLikov++] = new Pravokotnik(10,10, 20, 30, Color.green);
    liki[stLikov++] = new Kvadrat(70,70, 30, Color.yellow);

    StdDraw.enableDoubleBuffering();
    while(true) {

      if (StdDraw.hasNextKeyTyped()) {
        char c = StdDraw.nextKeyTyped();
        int deltaX = 0, deltaY = 0;
        switch (c) {
          case '+' :
            for (int i = 0; i < stLikov; i++) {
              liki[i].spremeniVelikost(1);
            }
            break;
          case '-' :
            for (int i = 0; i < stLikov; i++) {
              liki[i].spremeniVelikost(-1);
            }
            break;
          case 'w': deltaY++; break;
          case 'a': deltaX--; break;
          case 's': deltaY--; break;
          case 'd': deltaX++; break;
        }
        if (deltaY != 0 || deltaX != 0)
          for (int i = 0; i < stLikov; i++) {
            liki[i].premakni(deltaX*5, deltaY*5);
          }
      }

      StdDraw.clear(Color.white);


      for (int i = 0; i < stLikov; i++) {
        liki[i].narisi();
      }

      StdDraw.pause(100);
      StdDraw.show();
    }
  }
}
