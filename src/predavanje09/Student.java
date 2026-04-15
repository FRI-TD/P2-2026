package predavanje09;

public class Student {
  static int MAX_OCEN = 10;

  private String ime;
  private String id;

  private String status;  // ce povprecje > 9  -> "Odlicen", sicer "Dober"

  private int[] ocene;
  private int stOcen;

  Student() {
    this.ocene = new int[MAX_OCEN];
    this.stOcen = 0;
  }

  Student(String ime, String id) {
    this(); // klic konstruktorja Student()

    this.ime = ime;
    this.id  = id;
  }

  public void setIme(String ime) {
    if (ime.length() > 0 )
      this.ime = ime;
  }

  public String getStatus() {
    return this.status;
  }
  public String getIme() {
    return this.ime;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public int getStOcen() {
    return this.stOcen;
  }

  public int[] getOcene() {
    return this.ocene;
  }

  private void setStatus() {
    this.status = povprecjeOcen() > 9 ? "Odličen" : "Dober";
  }

  public void dodajOceno(int ocena) {
    // ce je tabela polna -> ocene ne dodamo
    if (this.stOcen >= MAX_OCEN)
      return;

    this.ocene[this.stOcen++] = ocena;
    setStatus();
  }

  double povprecjeOcen() {
    if (stOcen == 0) return 0;
    int vsota = 0;
    for (int i = 0; i < stOcen; i++)
      vsota += ocene[i];
    return (double) vsota / stOcen;
  }

  public String toString() {
    return String.format("Ime: %s, id: %s, povprecje: %.2f, status: %s",
             ime, id, povprecjeOcen(), status);
  }

}


