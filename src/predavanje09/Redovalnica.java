package predavanje09;

public class Redovalnica {

  static double povprecjeOcenS(Student s) {
    if (s.getStOcen() == 0) return 0;
    int vsota = 0;
    for (int i = 0; i < s.getStOcen(); i++)
      vsota += s.getOcene()[i];
    return (double) (vsota / s.getStOcen());
  }

  public static void main(String[] args) {
//    Student s1 = new Student();
//    s1.ime = "Micka";
//    s1.id  = "63250001";
    Student s1 = new Student("Micka", "63250001");
    s1.dodajOceno(10);
    s1.dodajOceno(8);
    s1.dodajOceno(10);
    System.out.println("Status: " + s1.getStatus());

    System.out.println(s1.toString());

    //System.out.printf("Povprečje ocen studenta s1: %.2f \n", s1.povprecjeOcen() );

    Student s2 = new Student();
    s2.setIme( "Janez");;
    s2.setId("63250002");
    s2.dodajOceno(6);
    s2.dodajOceno(7);
    System.out.println(s2.toString());
    //System.out.printf("Povprečje ocen studenta s2: %.2f \n", povprecjeOcenS(s2) );


    Student[] studenti = new Student[3];
    studenti[0] = s1;
    studenti[1] = s2;

    studenti[2] = new Student();
    studenti[2].setIme( "Tone");
    studenti[2].setId("63250003");


  }
}
