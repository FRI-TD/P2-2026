package predavanja13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

  static void copy(String imeVhoda, String imeIzhoda) {
    try {
      File iF = new File(imeVhoda);
      File oF = new File(imeIzhoda);
      FileInputStream fis = new FileInputStream(iF);
      FileOutputStream fos = new FileOutputStream(oF);
      while (fis.available() > 0) {
        int z = fis.read();
        fos.write(z);
      }
      fis.close();
      fos.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }

  }

  static void copyWithBuffer(String imeVhoda, String imeIzhoda) {
    try {
      File iF = new File(imeVhoda);
      File oF = new File(imeIzhoda);
      FileInputStream fis = new FileInputStream(iF);
      FileOutputStream fos = new FileOutputStream(oF);

      byte[] blok = new byte[4096];
      while (fis.available() > 0) {
        int koliko = fis.read(blok);
        System.out.println(koliko);
        fos.write(blok,0,koliko);
      }


      fis.close();
      fos.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }

    public static void main(String[] args) {
    long zacetek = System.currentTimeMillis();

    copyWithBuffer("viri/volk8.bmp", "viri/volkX1.bmp");

    long cas = System.currentTimeMillis() - zacetek;
    System.out.printf("DONE in %.2fs\n", 1.0*cas/1000);
  }
}
