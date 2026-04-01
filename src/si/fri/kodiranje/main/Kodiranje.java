package si.fri.kodiranje.main;

import si.fri.kodiranje.io.BeriPisi;

public class Kodiranje {

  /**
   * Leto.
   */
  public static final int TEKOCE_LETO = 2026;

  public static void main(String[] args) {
    if (args.length < 4) { // program mora imeti vsaj 4 argumente
      System.out.println("Uporaba programa: java Kodiranje nacin smer vhod izhod {kljuc}");
      System.exit(1);
    }

    /* Argumente
       shranim
       v spremenljivke
     */
    String nacin   = args[0];
    String smer    = args[1];
    String inFile  = args[2];
    String outFile = args[3];
    String kljuc   = args.length == 5 ? args[4] : "";

    doKodiranje(nacin, smer, inFile, outFile, kljuc);
  }

  /**
   * Metoda doKodiranje opravi glavno delo.
   * @param nacin nacin kodiranja
   * @param smer smer kodiranje
   * @param inFile vhodna datoteka
   * @param outFile izhodna datoteka
   * @param kljuc kljuc, ki se uporablja v XOR; pri ostalih mnetodah je lahko prazen
   *
   * @author tomaz
   * @see Kodiranje
   * @since 1.4
   */
  static void doKodiranje(String nacin, String smer, String inFile, String outFile, String kljuc) {
    String vsebina = BeriPisi.preberiDatoteko(inFile);

    switch (nacin) {
      case "XOR":
        vsebina = smer.equals("code") ? Kodirniki.kodirajXOR(vsebina, kljuc) : Kodirniki.dekodirajXOR(vsebina, kljuc);
        break;
      case "NUM":
        vsebina = smer.equals("code") ? Kodirniki.kodirajNUM(vsebina) : Kodirniki.dekodirajNUM(vsebina);
        break;
      case "BASE64":
        vsebina = smer.equals("code") ? Kodirniki.kodirajBase64(vsebina) : Kodirniki.dekodirajBase64(vsebina);
        break;
      default:
        /// če ni niti XOR niti NUM niti BASE64
        // nič ne naredimo
    }

    BeriPisi.zapisiDatoteko(outFile, vsebina);
  }

}
