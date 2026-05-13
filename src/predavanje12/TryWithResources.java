package predavanje12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(new File("viri/drzave.txt"));
         PrintWriter pw = new PrintWriter("ime.txt");)
    {

      sc.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }
}
