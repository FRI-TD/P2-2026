package predavanje06;

public class Sah {

  public static char beliKralj = '\u2654';
  public static char crniKralj = '\u265A';

  public static void main(String[] args) {
    for (int i=0; i<6; i++)
      System.out.printf("%c ", beliKralj+i);
    System.out.println();
    for (int i=0; i<6; i++)
      System.out.printf("%c ", crniKralj+i);
    System.out.println();

  }
}
