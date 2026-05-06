package predavanje11;

import java.util.ArrayList;

public class ArrayListTest {
  public static void main(String[] args) {
    ArrayList<Integer> stevila = new ArrayList();

    stevila.add(5);
    stevila.add(6);
    stevila.add(1);
    stevila.remove((Integer)1);
    stevila.add(0,7);

    for (Integer i : stevila) {
      System.out.println(i);
    }

    System.out.println(stevila.contains(1));
  }
}
