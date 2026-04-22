package predavanje10;

public class AnonimniRazredTest {

  public static void main(String[] args) {
    Oseba o = new Oseba("Micka") {// razsiritev razreda
      void izpisi() {
        System.out.println("Ime:" + ime);
      }
    };
    o.izpisi();
  }
}
