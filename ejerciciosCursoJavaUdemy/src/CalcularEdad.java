import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcularEdad {

    public static void main(String[] args) {
        /*Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
         convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona
         de acuerdo a la fecha actual.
        * */


        System.out.println("Ingrese su fecha de nacimiento con el siguiente formato: Dia/Mes/Año - Ejemplo: 14/02/1980");
        Scanner teclado = new Scanner(System.in);
        String ingFecha = teclado.next();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(ingFecha, formato);
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNac, fechaActual);
        System.out.println("Esta es tu edad: Tienes "+periodo.getYears()+" años, "+periodo.getMonths()+" meses y "+periodo.getDays()+" días de vida.");


    }
}
