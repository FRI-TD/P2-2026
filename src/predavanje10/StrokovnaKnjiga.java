package predavanje10;

public class StrokovnaKnjiga extends Knjiga {

  // stvarno kazalo
  private String index;

  StrokovnaKnjiga(String avtor, String naslov, int letoIzdaje, String index) {
    super(avtor, naslov, letoIzdaje); // klic konstruktorja razreda Knjiga

    this.index = index;
  }


  @Override
  public String getPodrobnosti() {
    return "index..";
  }
}
