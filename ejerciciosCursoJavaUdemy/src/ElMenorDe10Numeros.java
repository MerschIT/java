import java.util.Scanner;

public class ElMenorDe10Numeros {
    public static void main(String[] args) {
        // EJERCICIO: ENCONTRAR EL NUMERO MENOR
/*        Crear una clase con el método main donde el desafío es buscar el número menor
          de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de
          números a comparar, luego utilizando una sentencia for iterar el numero de veces
          (ingresado) para pedir el numero entero, entonces se requiere:

        Calcular el menor número e imprimir el valor.

        Si el menor número es menor que 10, imprimir "El número menor es menor que 10!",
        si no, imprimir " el numero menor es igual o mayor que 10!".*/


        System.out.println("Ingrese los número (total 10)");
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int [10];
        int numeroMenor = 999999;
        int maxVector = numeros.length;
        for(int i=0;i<maxVector;i++){
            System.out.println("Ingrese el número:");
            numeros[i] = teclado.nextInt();
            if(numeros[i]<numeroMenor){
                numeroMenor=numeros[i];
            }
        };
        System.out.println("Los números ingresados son: ");
        for(int j =0; j<maxVector;j++){
            if(j<(maxVector-1)){
                System.out.print(numeros[j]+", ");
            }else{
                System.out.println(numeros[j]+".");
            }
        }
        System.out.println("");
        System.out.println("De los ingresados, el menor es el número "+numeroMenor);
        if(numeroMenor<10){
            System.out.println("El número menor es menor que 10!");
        }else{
            System.out.println("El número menor es igual o mayor que 10!");
        }
    }
}
