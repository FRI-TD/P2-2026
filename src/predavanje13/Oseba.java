package predavanje13;

import java.io.Serializable;

public class Oseba implements Serializable {
  String ime;
  String priimek;
  String naslov;
  String telefon;

  public Oseba(String ime, String priimek, String naslov, String telefon) {
    this.ime = ime;
    this.priimek = priimek;
    this.naslov = naslov;
    this.telefon = telefon;
  }

  @Override
  public String toString() {
    return "Oseba{" +
            "ime='" + ime + '\'' +
            ", priimek='" + priimek + '\'' +
            ", naslov='" + naslov + '\'' +
            ", telefon='" + telefon + '\'' +
            '}';
  }
}
