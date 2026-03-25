package si.fri.kodiranje.test;

import si.fri.kodiranje.io.BeriPisi;

public class TestBranje {

  public static void main(String[] args) {
    String vsebinaDatoteke = BeriPisi.preberiDatoteko("viri/passwd");

    System.out.println(vsebinaDatoteke);
  }
}
