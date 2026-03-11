package osnove;

import java.io.PrintWriter;
import java.util.Scanner;

public class Postevanka {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.print("Vpisi n: ");
    int n = sc.nextInt();

    System.out.print("Vpisi a: ");
    int a = sc.nextInt();

    System.out.print("Vpisi b: ");
    int b = sc.nextInt();

    String imeDatoteke = String.format("viri/veckratniki_%d_%d_%d.txt", n, a, b);

    // odprem datoteko za pisanje
    PrintWriter pw = new PrintWriter(imeDatoteke);

    for(int i=a; i<=b; i=i+1) {
      pw.printf("%2d * %2d = %2d \n", i, n, i*n);
    }

    // datoteko zaprem
    pw.close();
  }
}
