package operatorji;

public class Tridelni {

  // zdruzi argumente v niz (med seboj naj bodo ločeni z vejico)
  public static void main(String[] args) {
    String rezultat = "";
    for (int i=0; i<args.length; i++) {
      /*
      if (rezultat.isEmpty())
        rezultat = rezultat + "" + args[i];
      else
        rezultat = rezultat + "," + args[i];
      */

      rezultat = rezultat + (rezultat.isEmpty() ? "" : ",") + args[i];
    }
    System.out.println(rezultat);
  }
}
