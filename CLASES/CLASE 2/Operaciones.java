public class Operaciones {

  public static void main(String[] args) {
    int nro1 = 5;
    int nro2 = 2;

    sumar(nro1, nro2);
    restar(nro1, nro2);
    multiplicar(nro1, nro2);
    dividir(nro1, nro2);
  }

  public static void sumar(int nro1, int nro2) {
    System.out.println("Suma: " + (nro1 + nro2));
  }

  public static void restar(int nro1, int nro2) {
    System.out.println("Resta: " + (nro1 - nro2));
  }

  public static void multiplicar(int nro1, int nro2) {
    System.out.println("Multiplicación: " + (nro1 * nro2));
  }

  public static void dividir(int nro1, int nro2) {
    if (nro2 != 0) {
      System.out.println("División: " + ((double) nro1 / nro2));
    } else {
      System.out.println("Error: no se puede dividir por 0");
    }
  }
}
