public class Tabela {

  public static void main(String[] args) {
    // naredimo tabelo celih stevil velikosti 5
    int [] tabela = new int[5];
    tabela[0] = 3;
    tabela[1] = 1;
    tabela[2] = 4;
    tabela[3] = 6;
    tabela[4] = 9;

    System.out.printf("Tretji element tabele: %d \n", tabela[2]);
    System.out.printf("Dolzina tabele: %d \n", tabela.length);

    tabela[2] = 7;
    System.out.printf("Tretji element tabele: %d \n", tabela[2]);

    System.out.println("Vsi elementi tabele: ");
    for(int i=0; i< tabela.length; i++)
      System.out.println(tabela[i]);

    // NAPAKA!
    // tabela[5] = 10;

    int [] tabela1 = {1,2,3,4,5};

    System.out.println("Vsi elementi druge tabele: ");
    for(int i=0; i< tabela1.length; i++)
      System.out.println(tabela1[i]);


    tabela = new int[] {9,8,7,6,5};
  }
}
