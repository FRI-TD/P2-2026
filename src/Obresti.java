public class Obresti {

  public static void main(String[] args) {
    /*
      Komentar
      v 
      vec vrsticah
    */
	int    n = 10;    // stevilo let
	double p = 5;     // 5% obrestna mera
	double g = 1000;  // glavnica je 1000 EUR

	double gN = g * Math.pow(1+p/100,n);

	System.out.println("Glavnica \\ : "      + g);
	System.out.println("Stevilo let: "   + n);
	System.out.println("Obrestna mera: " + p);
	System.out.println("Koncni znesek: " + gN);
  }	
}