package predavanje10;

public class Leposlovje  extends Knjiga {
  private static int MAX_MNENJ = 10;

  private String[] mnenjaBralcev;
  private int stMnenj;

  public Leposlovje(String avtor, String naslov, int letoIzdaje) {
    super(avtor, naslov, letoIzdaje);

    this.mnenjaBralcev = new String[MAX_MNENJ];
    this.stMnenj = 0;
  }

  void dodajMnenje(String mnenje) {
    if (stMnenj < MAX_MNENJ)
      this.mnenjaBralcev[this.stMnenj++] = mnenje;
  }

  @Override
  public String getPodrobnosti() {
    return "mnenja bralcev...";
  }
}
