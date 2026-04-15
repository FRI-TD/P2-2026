package predavanje09;

public class Imenik {
  public static void main(String[] args) {
    Oseba o = new Oseba();
    o.ime = "Micka";
    // o.priimek = "Novak";
    o.izpisi();

    Clovek c = new Clovek();
    c.ime    = "Janez";
    c.priimek = "Novak";
    c.izpisi();
  }
}
