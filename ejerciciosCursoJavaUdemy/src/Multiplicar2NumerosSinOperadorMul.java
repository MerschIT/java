import java.util.Scanner;

public class Multiplicar2NumerosSinOperadorMul {
    public static void main(String[] args) {
        /*Mediante el teclado pedir dos números enteros positivos o negativos y
         multiplicarlos, pero sin usar el símbolo de multiplicación (*).

        Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta
        los unarios, donde menos por menos es positivo.

        */

        Scanner teclado = new Scanner(System.in);
        int total = 0;
        System.out.println("Ingrese el primer número:");
        int entrada1 = teclado.nextInt();
        int numero1 = Math.abs(entrada1);
        System.out.println("Ingrese el segundo número:");
        int entrada2 = teclado.nextInt();
        int numero2 = Math.abs(entrada2);

        for (int i = 0; i< numero2; i++){
            total += numero1;

        }
        /// CONVIERTE EL NUMERO EN NEGATIVO SI ES NECESARIO
        if(entrada1 == 0 || entrada2 == 0){
            System.out.println("Cualquier número multiplicado por 0 da 0.");
        }else{
            if((entrada1 <0 && entrada2 <0) || (entrada1 >0 && entrada2 >0) ){
                System.out.println("El total de multiplicar "+ entrada1 +" por "+ entrada2 +" es: "+total);
            }else{
                total = total * -1;
                System.out.println("El total de multiplicar "+ entrada1 +" por "+ entrada2 +" es: "+total);
            }
        }


    }
}
