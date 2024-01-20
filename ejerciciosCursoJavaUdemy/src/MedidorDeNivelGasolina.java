import java.util.Scanner;

public class MedidorDeNivelGasolina {
    public static void main(String[] args) {

//        EJERCICIO N°2:
      /*  Suponiendo un tanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

        La medida o capacidad actual del tanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

        Si la capacidad actual es 70 litros: imprimir tanque lleno
        Si está entre 60 y menor a 70: imprimir tanque casi lleno
        Si está entre 40 y menor a 60: imprimir tanque 3/4
        Si está entre 35 y menor a 40: imprimir Medio tanque
        Si está entre 20 y menor a 35: imprimir Suficiente
        Si está entre 1 y menor a 20: imprimir Insuficiente
      */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nivel de gasolina del estanque:");
        int nivel = teclado.nextInt();

        if(nivel == 70){
            System.out.println("Tanque lleno");
        }else if(nivel>=60){
            System.out.println("Tanque casi lleno");
        }else if(nivel >=40){
            System.out.println("Tanque 3/4");
        }else if(nivel >= 35){
            System.out.println("Medio Tanque");
        }else if(nivel >=20){
            System.out.println("Suficiente");
        }else{
            System.out.println("Insuficiente");
        }

    }
}