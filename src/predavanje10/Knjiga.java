package predavanje10;

public abstract class Knjiga extends Object {
  static int steviloVsehKnjig = 0;

  private int zaporednaStevilka;
  private String avtor;
  private String naslov;
  private int letoIzdaje;

  Knjiga(String avtor, String naslov, int letoIzdaje) {
    steviloVsehKnjig++;

    this.zaporednaStevilka = steviloVsehKnjig;
    this.avtor = avtor;
    this.naslov = naslov;
    this.letoIzdaje = letoIzdaje;
  }

  public String getAvtor() {
    return this.avtor;
  }
  public void setAvtor(String avtor) {
    this.avtor = avtor;
  }

  public String getNaslov() {
    return naslov;
  }

  public void setNaslov(String naslov) {
    this.naslov = naslov;
  }

  public int getLetoIzdaje() {
    return letoIzdaje;
  }

  public void setLetoIzdaje(int letoIzdaje) {
    this.letoIzdaje = letoIzdaje;
  }

  /**
   * @return Vrne predstavitev knjige v obliki niza
   */
  public String toString() {
    return String.format("%d. Avtor: %s, Naslov: %s, Leto izdaje: %d, Podrobnosti: %s", this.zaporednaStevilka, this.avtor, this.naslov, this.letoIzdaje, getPodrobnosti());
  }

  abstract public String getPodrobnosti();
}
