package predavanje12;

public class VrziIzjemo {

  static void odpriDatoteko(String imeDatoteke)  {
    if (imeDatoteke.isEmpty())
      throw new RuntimeException("Ime datoteke je prazno");
  }

  public static void main(String[] args) {
    odpriDatoteko("");
  }

}
