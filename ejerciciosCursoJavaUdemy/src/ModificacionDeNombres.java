import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ModificacionDeNombres {
    public static void main(String[] args) {

        /*
        La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

       **** -Se requiere desarrollar un programa que reciba los nombres de
            3 integrantes de tu familia o amigos como argumentos de línea de comandos.

       **** -Se pide por cada nombre de la persona una nueva variable del
            tipo String al tomar el segundo carácter pero convertido en
            mayúscula y se le concatena un punto y los dos últimos caracteres
             de la persona. Por ejemplo para Andres debe quedar como N.es

            -Debe imprimir como resultado los tres nuevos nombres separado
            con guion bajo (como una única variable).

            Ejemplo, un resultado final esperado para los nombres Andres,
            Maria y Pepe podría ser:

                N.es_A.ia_E.pe


         */

    // INGRESO DE NOMBRES POR LINEA DE COMANDOS
        System.out.println("-------------------------------------------------");
        System.out.println("Bienvenido al sistema de modificación de nombres.");
        System.out.println("-------------------------------------------------");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer nombre: ");
        String nombre1 = teclado.next();
        System.out.println("Ingrese el segundo nombre: ");
        String nombre2 = teclado.next();
        System.out.println("Ingrese el tercer nombre: ");
        String nombre3 = teclado.next();

//  CONVERTIR STRING EN ARRAY Y PONER 2DA LETRA EN MAYÚSCULA
        char[] primeraPersona = nombre1.toCharArray();
        String segundaLetra = primeraPersona[1] + "";
        String nombreAcortado1 = segundaLetra.toUpperCase() + "." + nombre1.substring(nombre1.length()-2);

        char[] segundaPersona = nombre2.toCharArray();
               segundaLetra = segundaPersona[1] + "";
        String nombreAcortado2 = segundaLetra.toUpperCase() + "." + nombre2.substring(nombre2.length()-2);

        char[] terceraPersona = nombre3.toCharArray();
               segundaLetra = terceraPersona[1] + "";
        String nombreAcortado3 = segundaLetra.toUpperCase() + "." + nombre3.substring(nombre3.length()-2);

//  UNIR LOS 3 NOMBRES EN UN SOLO STRING
        String los3Nombres = nombreAcortado1 + "_" + nombreAcortado2 + "_" + nombreAcortado3;
        System.out.println("-------------------------------------------------");
        System.out.println("Resultado: " + los3Nombres);

    }

}