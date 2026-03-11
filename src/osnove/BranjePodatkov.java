package osnove;

import java.util.*;

public class BranjePodatkov {

  public static void main(String[] args) {
    String ime;
    int starost;

    Scanner tipkovnica = new Scanner(System.in); // se "povežem" s tipkovnico

    System.out.print("Vpisi svoje ime: ");
    ime = tipkovnica.nextLine();

    System.out.print("Vpisi starost: ");
    starost = tipkovnica.nextInt();

    System.out.printf("Pozdravljen %s, star si %d let.", ime, starost);
  }
}
