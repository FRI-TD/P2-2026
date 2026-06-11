package predavanje13;

import java.io.File;
import java.io.FileInputStream;

public class HexDump {

  public static void main(String[] args) {
    File f = new File("viri/drzave.txt");
    try {
      FileInputStream fis = new FileInputStream(f);
      int i=0;StringBuilder sb = new StringBuilder();
      while (fis.available() > 0) {
        int z = fis.read(); i++;
        sb.append((z>=32) ? (char)z:".");
        System.out.printf("%02x ", z);
        if (i%16 ==0) {
          System.out.printf("  | %s |\n", sb.toString());
          sb = new StringBuilder();
        }
      }
      if (sb.length() > 0)
        System.out.printf("%s  | %s %s|\n", " ".repeat(3*(16-i%16)), sb.toString(), " ".repeat(16-i%16));

      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: "+e);
    }


  }
}
