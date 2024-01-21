import java.util.Scanner;

public class MenuDeOpcionesIterativo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;




            System.out.println("********************** " +
                    "\n Menú de opciones abierto." +
                    "\n Las opciones disponibles para elegir son: \n");
                     System.out.println(
                    " * 1 = Actualizar \n" +
                    " * 2 = Eliminar \n" +
                    " * 3 = Agregar \n" +
                    " * 4 = Listar \n" +
                    " * 5 = Salir \n" +
                    "-------------------------------");

                    while (bandera) {
                        System.out.println("------------------------------- " +
                           "\n[ Elija una opción del 1 al 5: ]");

                           int eleccion = teclado.nextInt();

                           if(eleccion > 0 && eleccion < 6){

                            switch (eleccion) {
                                case 1:
                                    System.out.println("Actualización finalizada correctamente.");
                                    break;
                                case 2:
                                    System.out.println("Se ha eliminado correctamente.");
                                    break;
                                case 3:
                                    System.out.println("Se ha agregado correctamente.");
                                    break;
                                case 4:
                                    System.out.println("Se muestra lista indicada");
                                    break;
                                case 5:
                                    bandera = false;
                                    System.out.println("Fin del programa.");
                                    break;
                            }
            }else{
                        System.out.println("La opción elegida no existe.");
                    }





        }
    }
}
