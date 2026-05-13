package predavanje12;

public class NapacenArgument extends RuntimeException {
  @Override
  public String getMessage() {
    return "Tangens pri tem argumentu se ne da izračunati";
  }
}
