package predavanje07;

import static java.lang.Math.PI;

public class SwitchTest {
  public static void main(String[] args) {
    int a = 2;
    switch (a) {
      case 1:
        System.out.println("Ena"); break;
      case 2:
        System.out.println("Dva");break;
      case 3:
        System.out.println("Tri"); break;
      default:
        System.out.println("Nekaj drugega");
    }

    String niz = switch(a) {
      case 1 -> "Ena";
      case 2 -> "Dva";
      case 3 -> "Tri";
      default -> "Nekaj drugega"; //
    };
    System.out.println(niz);

    double pi = PI;
  }

}
