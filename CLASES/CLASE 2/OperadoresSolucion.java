import java.util.Scanner;

public class OperadoresSolucion {

    // ----- CLASES INTERNAS (todo en un solo archivo) -----

    static class Menu {
        static void mostrarMenu() {
            System.out.println(
                "Seleccione la operación a realizar\n" +
                " 1. Sumar\n" +
                " 2. Restar\n" +
                " 3. Multiplicar\n" +
                " 4. Dividir\n" +
                " 0. Salir"
            );
        }
    }

    static class Calculadora {
        private final int nro1, nro2;

        Calculadora(int nro1, int nro2) {
            this.nro1 = nro1;
            this.nro2 = nro2;
        }

        int sumar()       { return nro1 + nro2; }
        int restar()      { return nro1 - nro2; }
        int multiplicar() { return nro1 * nro2; }

        double dividir() {
            if (nro1 == 0 && nro2 == 0) {
                System.out.println("El resultado es indeterminado");
                return Double.NaN;
            }
            if (nro2 == 0) {
                System.out.println("No se puede dividir por cero");
                return Double.NaN;
            }
            return (double) nro1 / nro2;
        }

        int getNro1() { return nro1; }
        int getNro2() { return nro2; }
    }

    // -------------------- MAIN --------------------
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, nro1 = 0, nro2 = 0;

        do {
            Menu.mostrarMenu();
            opcion = entrada.nextInt();

            if (opcion != 0) {
                System.out.print("Ingrese el primer número: ");
                nro1 = entrada.nextInt();
                System.out.print("Ingrese el segundo número: ");
                nro2 = entrada.nextInt();
            }

            Calculadora calc = new Calculadora(nro1, nro2);

            switch (opcion) {
                case 1:
                    System.out.println(calc.getNro1() + " + " + calc.getNro2() + " = " + calc.sumar());
                    break;
                case 2:
                    System.out.println(calc.getNro1() + " - " + calc.getNro2() + " = " + calc.restar());
                    break;
                case 3:
                    System.out.println(calc.getNro1() + " * " + calc.getNro2() + " = " + calc.multiplicar());
                    break;
                case 4:
                    double r = calc.dividir();
                    if (!Double.isNaN(r)) {
                        System.out.println(calc.getNro1() + " / " + calc.getNro2() + " = " + r);
                    }
                    break;
                case 0:
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        entrada.close();
    }
}
