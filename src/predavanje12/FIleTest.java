package predavanje12;

import java.io.File;

public class FIleTest {

  public static void main(String[] args) {
    String path = "code/Predavanja";

    File f1 = new File(path);
    System.out.printf("Datoteka obstaja: %s\n", f1.exists() ? "true" : "false");

    File f2 = new File(f1, "README.md");
    System.out.printf("Datoteka obstaja: %s\n", f2.exists() ? "true" : "false");

    System.out.printf("Velikost datoteke %s: %d\n", f2.getPath(), f2.length());
    System.out.printf("Velikost datoteke %s: %d\n", f2.getName(), f2.length());

    String[] seznam = f1.list();
    for (String file: seznam) {
      System.out.println(file);
    }
  }
}
