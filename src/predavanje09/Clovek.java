package predavanje09;

public class Clovek extends Oseba {
  String priimek;

  void izpisi() {
    super.izpisi();
    System.out.println("Moje ime in priimek je: " + ime + " " + priimek);
  }
}
