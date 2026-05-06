package predavanje11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Meseci {

  public static void main(String[] args) {
    Map<String, Integer> meseci = new HashMap();

    meseci.put("JAN", 31);
    meseci.put("FEB", 28);
    meseci.put("MAR", 31);
    meseci.put("APR", 30);
    meseci.put("MAJ", 31);
    meseci.put("JUN", 30);
    meseci.put("JUL", 31);

    meseci.containsKey("JAN"); //--> true
    meseci.remove("FEB"); // odstrani kljuc in vrednost
    meseci.size(); // --> 6

    for (String kljuc : meseci.keySet()) {
      System.out.printf("%s = %d, ", kljuc, meseci.get(kljuc));
    }
    System.out.println();

    for (int i : meseci.values())
      System.out.println(i);
  }
}
