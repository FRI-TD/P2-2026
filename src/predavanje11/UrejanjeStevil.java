package predavanje11;

import java.util.Arrays;

public class UrejanjeStevil {

  public static void main(String[] args) {
    int[] tab = {4,1,3,8,7,5,0,2,5,9,4};
    System.out.println(Arrays.toString(tab));

    Arrays.sort(tab);
    System.out.println(Arrays.toString(tab));
  }
}
