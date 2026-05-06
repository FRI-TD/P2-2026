package predavanje11;

public class Oseba implements Comparable<Oseba> {

  String ime;
  int visina;

  public Oseba(String ime, int visina) {
    this.ime = ime;
    this.visina = visina;
  }

  @Override
  public String toString() {
    return String.format("Ime: %s, visina: %d", this.ime, this.visina);
  }

  @Override
  public int compareTo(Oseba o) {
    return this.visina - o.visina;
  }
}
