package predavanje12;

public class Drzava implements Comparable<Drzava> {

  private String kratica;
  private String glavnoMesto;
  private long steviloPrebivalcev;

  public Drzava(String kratica, String glavnoMesto, long steviloPrebivalcev) {
    this.kratica = kratica;
    this.glavnoMesto = glavnoMesto;
    this.steviloPrebivalcev = steviloPrebivalcev;
  }

  public String getKratica() {
    return kratica;
  }

  public void setKratica(String kratica) {
    this.kratica = kratica;
  }

  public String getGlavnoMesto() {
    return glavnoMesto;
  }

  public void setGlavnoMesto(String glavnoMesto) {
    this.glavnoMesto = glavnoMesto;
  }

  public long getSteviloPrebivalcev() {
    return steviloPrebivalcev;
  }

  public void setSteviloPrebivalcev(long steviloPrebivalcev) {
    this.steviloPrebivalcev = steviloPrebivalcev;
  }

  @Override
  public String toString() {
    return String.format("Drzava: %s, glavno mesto: %s, stevilo prebivalcev: %d",
            this.kratica, this.glavnoMesto, this.steviloPrebivalcev);
  }

  @Override
  public int compareTo(Drzava o) {
    // primerjam sebe (this) in o po abecedi glavnega mesta
    return this.glavnoMesto.compareTo(o.glavnoMesto);
  }
}
