package predavanja6;

import java.io.File;
import java.util.Scanner;

public class ReadPasswd {

  public static void main(String[] args) throws Exception {
    // String imeDatoteke = "/etc/passwd";
    String imeDatoteke = "viri/passwd";

    Scanner sc = new Scanner(new File(imeDatoteke));

    while (sc.hasNextLine()) {

      String vrstica = sc.nextLine();

      String[] deli = vrstica.split(":");
      if (deli.length == 7) {
        System.out.printf("username: %s, uid: %s \n", deli[0], deli[2]);
      }
    }

    sc.close();
  }
}
