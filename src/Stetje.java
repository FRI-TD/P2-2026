public class Stetje {

  public static void main(String [] args) {
    String [] besede = new String [] {
      "pomlad", "jabolko", "jesen", "zima", "lopar", "bor"
    };

    // ko naredim tabelo, so v njej samo ničle!
    int [] pojavitve = new int[26];

    for(int i=0; i<besede.length; i++) {
      //System.out.println(besede[i]);
      char crka = besede[i].charAt(0); // prva crka i-te besede
      int indeksCrke = crka - 'a';

      pojavitve[indeksCrke] = pojavitve[indeksCrke] + 1;
    }

    for(int i=0; i<26; i++) {
      System.out.printf("Stevilo besed na crko '%c': %d\n", 'a'+i, pojavitve[i]);
    }
  }
}
