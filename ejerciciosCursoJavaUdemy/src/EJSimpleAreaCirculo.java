import java.util.Scanner;
public class EJSimpleAreaCirculo {
    public static void main(String[] args) {
        /*Pedir el radio de un círculo y calcular su área.
        Utilizar la formula: area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
        */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de areas.");
        System.out.print("Ingrese el radio del círculo: ");
        double radio = teclado.nextDouble();

        System.out.println("El área del circulo es: "+(3.1416*(radio*radio)));
    }
}
