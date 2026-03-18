package operatorji;

public class Dvojisko {

  static String vDvojisko(int x) {
    String result="";
    while (x > 0) {
//      if ((x & 1) == 1) // zadnji bit prižgan
//        result = "1" + result;
//      else
//        result = "0" + result;
      result = ((x & 1) == 1 ? "1" : "0") + result;
      x = x >> 1;
    }
    return result.isEmpty() ? "0" : result;
  }

  static int vDesetisko(String x) {
    int result = 0;
    int bit = 1; // vrednost bita
    for(int i=x.length()-1; i>=0; i--) {
      if (x.charAt(i)=='1')
        result += bit;
      bit = bit << 1;   // bit = bit * 2
    }
    return result;
  }
  public static void main(String[] args) {
    int x = 0;
    String xDvojisko = vDvojisko(x);
    System.out.println(xDvojisko);

    int x2 = vDesetisko(xDvojisko);
    System.out.println(x2);
  }
}
