import java.io.File;
import java.util.Scanner;

public class BranjeDatoteke {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new File("viri/imena.txt"));

    /*
    // sprehod in izpis celotne datoteke
    while(sc.hasNextLine()) {
      String v = sc.nextLine();
      System.out.println(v);
    }
    */
    int n = sc.nextInt();sc.nextLine();
    String[] imena = new String[n];
    for(int i=0; i<n; i++)
      imena[i] = sc.nextLine();

    sc.close();


    for (int i=0; i<n; i++)
      System.out.println(imena[i]);
  }
}
