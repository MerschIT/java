import java.util.Scanner;

public class NotasDeAlumnos {
    public static void main(String[] args) {

/*        Pedir 20 notas finales de alumnos en una escala de 1 a 7,
          manejar decimales en las notas (double). Mostrar el promedio
          de las notas mayores a 5, promedio de notas inferiores a 4 y la
          cantidad de notas 1, ademas mostrar el promedio total.

        Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo
         pedir las notas una a una para realizar los cálculos (contadores, sumas).


         Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for
          y mostrar un mensaje de error finalizando el programa.*/
        //////////////////////////////////////////////

        double[] notasAlumnos = new double [20];
        Scanner teclado = new Scanner(System.in);
        double notaTotal = 0, alumnosNotaMas5 = 0, alumnosNotaMenos4 = 0,
        promedioNotasMas5 = 0, promedioNotasMenos4 = 0;
        int alumnosNota1 = 0, cantAlumMas5 = 0, cantAlumMenos4 = 0, error = 0;

        for(int i =0;i<notasAlumnos.length;i++){
            System.out.println("Ingrese la nota del alumno: ");
            notasAlumnos[i]=teclado.nextDouble();

            if(notasAlumnos[i]<=0 || notasAlumnos[i]>10){
                System.out.println("Error en ingreso de notas. Finalizando programa.");
                error = 1;
                break;
            }
            else if(notasAlumnos[i]==1){
                alumnosNota1++;
            } else if(notasAlumnos[i]>5){
                alumnosNotaMas5 += notasAlumnos[i];
                cantAlumMas5++;
            } else if (notasAlumnos[i]<4){
                alumnosNotaMenos4 += notasAlumnos[i];
                cantAlumMenos4++;
            }
            notaTotal += notasAlumnos[i];
        }
        //REALIZAMOS LOS PROMEDIOS SOLICITADOS
        promedioNotasMas5 = alumnosNotaMas5 / cantAlumMas5;
        promedioNotasMenos4 = alumnosNotaMenos4 / cantAlumMenos4;
        notaTotal = notaTotal / notasAlumnos.length;
        if(error == 1){
            System.out.println("Hubo un error en al carga de notas. Reinicie el programa.");
        }else{
            if(alumnosNota1 != 0){
                System.out.println("Cantidad de alumnos que sacaron solo 1 punto: "+ alumnosNota1);
            }else{
                System.out.println("Ningún alumno sacó 1.");
            }
            if(cantAlumMas5 != 0){
                System.out.println("Promedio de notas de los alumnos con mas de 5 puntos: "+ promedioNotasMas5);
            }
            if(cantAlumMenos4 != 0){
                System.out.println("Promedio de notas de los alumnos con menos de 4 puntos: "+ promedioNotasMenos4);
            }
            System.out.println("El promedio total de todas las notas es: "+notaTotal);
        }


    }
}
