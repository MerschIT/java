import java.util.Scanner;

/*Escriba un programa que imprima el número más alto de un arreglo de 7 elementos
 (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43},
  si se repite un valor considerar uno solo.
*/


public class ArraysNumeroMasAlto {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int[] arreglo = new int[7];
        int i;
        int longitudArreglo = arreglo.length;
        int valorMasAlto = 0;

        System.out.println("Ingrese los "+longitudArreglo+" números.");
        for (i=0;i<longitudArreglo;i++){
            arreglo[i]=teclado.nextInt();
        }

        for (i=0;i<longitudArreglo;i++){
            valorMasAlto = (valorMasAlto > arreglo[i] )? valorMasAlto : arreglo[i];
        }
        System.out.println("El valor más alto es: "+valorMasAlto);
    }
}
