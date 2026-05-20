package predavanja13;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class JavaMajorVersion {

  public static void main(String[] args) {
    String imeDatoteke = "D:\\Users\\tomaz\\Dropbox\\FRI\\pedagosko\\P2\\P2_2026\\code\\out\\production\\Predavanja\\predavanja13\\ListFiles.class";

    File f = new File(imeDatoteke);
    try {
      FileInputStream fis     = new FileInputStream(f);
      BufferedInputStream bis = new BufferedInputStream(fis);
      DataInputStream dis = new DataInputStream(bis);

      int magicNumber = dis.readInt();
      int minor = dis.readShort();
      int major = dis.readShort();

      System.out.printf("Magic: %X \n", magicNumber);
      System.out.printf("Java version: %d\n", major);

      dis.close();
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }
}
