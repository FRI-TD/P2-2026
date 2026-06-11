package predavanje06;

public class Split {

  public static void main(String[] args) {
    String vrstica = "abc.def,ghi";

    String[] deli = vrstica.split("[.,]");
    for (int i=0; i<deli.length; i++) {
      System.out.println(deli[i]);
    }
    System.out.println(deli.length);
  }
}
