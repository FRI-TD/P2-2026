package predavanja14;

import java.io.*;

public class PretvoriCP {

  public static void main(String[] args) {
    String inFile  = "viri/znaki.txt";
    String outFile = "viri/znaki1250.txt";

    try (InputStreamReader isr  = new InputStreamReader(new FileInputStream(new File(inFile)), "UTF-8");
         OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File(outFile)), "CP1250");
         ) {
      int z;
      while ((z = isr.read()) != -1) {
        osw.write(z);
      }
      // close() ni potreben, saj smo uporabili try-with-resources!
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }
}
