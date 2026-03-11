package operatorji;

// prikaz uporabe tridelnega operatorja ? za elegantno rešitev 2. domače naloge
class DN02 {
  public static void main(String[] args) {
    //args = new String[]{"abcdef"};

    double koren = Math.sqrt(args[0].length());
    int kv = (int) koren + ((int) koren < koren  ?  1 : 0);

    for (int i = 0; i < kv * kv; i++) {
      System.out.print(
        (i < args[0].length() ? args[0].charAt(i) : ".") +
        ((i + 1) % kv == 0 ? "\n" : " "));
    }
  }
}
