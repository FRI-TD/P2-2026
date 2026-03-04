import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Loto {

  public static void main(String[] args) {
    Random rnd = new Random();
    for(int i=1; i<=7; i++) {
      int x = rnd.nextInt(44) + 1;
      System.out.println(x);
    }


    }
}
