package predavanje10;

public class Knjiznica  {

  public static void main(String[] args) {
    StrokovnaKnjiga k1 = new StrokovnaKnjiga("Tim Lindholm", "The JVM Specification", 2012, "aload:179,371; arithmetic:45; arrays:55; attributes: 101;baload:187;binary:75");
    Leposlovje      k2 = new Leposlovje("France Bevk", "Pestrna", 1939);

    Knjiga[] knjige = new Knjiga[2];
    knjige[0] = k1;
    knjige[1] = k2;

    for (int i = 0; i < knjige.length; i++) {
      System.out.println(knjige[i]);
    }

    k2.dodajMnenje("Zelo lepa knjiga");

    if (knjige[1] instanceof Leposlovje)
      ((Leposlovje)knjige[1]).dodajMnenje("Super!");

    if (knjige[0] instanceof Leposlovje)
      ((Leposlovje)knjige[0]).dodajMnenje("Super!");

    //Knjiga k = new Knjiga("a","n", 2000);
  }
}
