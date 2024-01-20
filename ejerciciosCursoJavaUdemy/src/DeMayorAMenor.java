import java.util.Scanner;

public class DeMayorAMenor {
    public static void main(String[] args) {

//         EJERCICIO N° 1: PIDE 2 NÚMEROS Y ORDENALOS DE MAYOR A MENOR

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = teclado.nextInt();

        String resultado = num1 > num2 ? num1+", "+num2 : num2+", "+num1;
        System.out.println("Ordenados de mayor a menor: " + resultado);


    }
}
