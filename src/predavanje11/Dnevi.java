package predavanje11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Dnevi {
  public static void main(String[] args) {
    Set<String> dnevi = new TreeSet();

    dnevi.add("PON");
    dnevi.add("TOR");
    dnevi.add("SRE");
    dnevi.add("CET");
    dnevi.add("PET");
    dnevi.add("SOB");
    dnevi.add("NED");

    dnevi.add("PON");
    dnevi.add("PON");

    dnevi.remove("PON");

    String dan = "MON";
    System.out.printf("Dan '%s' %s del tedna.\n", dan, dnevi.contains(dan) ? "je":"ni");

    // dnevi.add(42);

    System.out.printf("Stevilo dni v tednu: %d\n", dnevi.size());

    // izpis vseh dni s pomočjo iteratorja
    Iterator<String> it = dnevi.iterator();
    while (it.hasNext()) {
      String d = it.next();
      System.out.print(d);
      if (it.hasNext()) System.out.print(", ");
    }
    System.out.println();

    // prehod po dnevih s for zanko
    for (String d : dnevi) {
      System.out.println(d);
    }

    int[] tab = {4,6,1,2,9,10};
    int idx=0;
    for(int i : tab) {
      System.out.println(i);
      idx++;
    }

  }
}
