package predavanja13;

import java.io.File;

public class ListFiles {

  static void listFiles(String path, int zamik) {
    File f = new File(path);
    String[] seznam = f.list();
    for(int i=0; i<seznam.length; i++) {
      System.out.println( "│   ".repeat(zamik) + (i == 0 ? "├──" : "") + seznam[i]);
      File f1 = new File(f, seznam[i]);
      if (f1.isDirectory())
        listFiles(f1.getPath(), zamik+1);
    }
  }
  public static void main(String[] args) {
    String path = "D:\\ALGATOR_ROOT\\data_root\\projects\\PROJ-BasicSort";

    listFiles(path, 0);
  }
}
