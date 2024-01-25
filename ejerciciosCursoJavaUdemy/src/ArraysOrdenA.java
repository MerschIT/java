import java.util.Scanner;

public class ArraysOrdenA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 10 número para rellenar el Array de 10 elementos:");
        int i;
        int[] arreglo = new int [10];
        for(i=0;i<arreglo.length;i++){
           arreglo[i]=teclado.nextInt();
        }
        System.out.println("Elementos organizados como determina la consigna:");
        for (i=0;i<=4;i++){
            System.out.println(arreglo[9-i]);
            System.out.println(arreglo[i]);
        }
    }
}
