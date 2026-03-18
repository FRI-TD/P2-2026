package operatorji;

public class StringBufferTest {

  static String toString(int mnozica) {
    StringBuffer result = new StringBuffer();
    for(char c='a'; c <= 'z'; c++) {
      result.append( (result.isEmpty() ? "" : ", ") + c);
    }
    return "[" + result + "]";
  }

  public static void main(String[] args) {
    String s1 = new String("abc");
    String s2 = "abc";

    StringBuffer niz = new StringBuffer("miha");
    System.out.println(niz);
    System.out.printf("Ime: %s\n", niz);

    niz.setCharAt(0,'M');
    System.out.println(niz);
    for(int i=0; i<niz.length(); i++)
      System.out.println(niz.charAt(i));
  }
}
