import javax.swing.*;
import java.util.Scanner;
public class NombreMasLargo {
    public static void main(String[] args) {

        /*
        EJERCICIO: Obtener el nombre mas largo de tres personas,
        según los siguientes requerimientos:

        Mediante el teclado pedir el nombre completo (nombre + apellido)
        de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
        Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
        (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
        Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.
        Restricción no usar loops en el desarrollo de la tarea.
        Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
*/

        //ENTRADA POR JOptionPane + Restricción: No usar loops
        String nombre = JOptionPane.showInputDialog(null,"Ingrese solo un nombre y un apellido de la primera persona:");
        String nombre1 = nombre.split(" ")[0];
               nombre = JOptionPane.showInputDialog(null,"Ingrese solo un nombre y un apellido de la segunda persona:");
        String nombre2 = nombre.split(" ")[0];
               nombre = JOptionPane.showInputDialog(null,"Ingrese solo un nombre y un apellido de la tercer persona:");
        String nombre3 = nombre.split(" ")[0];

        String nombreMasLargo = nombre1.length() > nombre2.length()? nombre1 : nombre2;
               nombreMasLargo = nombreMasLargo.length() > nombre3.length()? nombreMasLargo : nombre3;
        JOptionPane.showMessageDialog(null, "El nombre más largo es " + nombreMasLargo + " de " + nombreMasLargo.length() +
                " caracteres.");
    }
}
