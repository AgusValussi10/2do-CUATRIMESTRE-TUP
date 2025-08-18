import java.util.Scanner;

public class ComoEncadenar {

    // Método que recibe dos enteros y muestra la suma
    public void calcularSuma(int x, int y) {
        int suma = x + y;
        System.out.println("La suma de " + x + " y " + y + " es: " + suma);
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir números al usuario
        System.out.print("Ingrese el primer número: ");
        int nro1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int nro2 = sc.nextInt();

        // Crear objeto y llamar al método
        ComoEncadenar obj = new ComoEncadenar();
        obj.calcularSuma(nro1, nro2);

        sc.close();
    }
}
