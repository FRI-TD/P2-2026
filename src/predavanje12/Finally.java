package predavanje12;

public class Finally {

  public static void main(String[] args) {
    //args = new String[]{"1"};

    System.out.println("A");
    try {
      if (args.length != 1)
        throw new NapacenArgument();
      System.out.println("B");
    } finally {
      System.out.println("C");
    }
    System.out.println("D");
  }
}

