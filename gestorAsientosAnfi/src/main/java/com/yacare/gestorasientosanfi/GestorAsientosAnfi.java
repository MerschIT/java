package com.yacare.gestorasientosanfi;

import java.util.Scanner;


public class GestorAsientosAnfi {

    public static void main(String[] args) {
        
        /*
          - Anfiteatro con 10 filas y cada fila tiene 10 asientos. 
            Desarrollar sistema que permita seleccionar un asiento libre
            y poder ponerlo como ocupado.
        
            1# Cargar el mapa de asientos, marcando con una L los asientos 
               libres y con una X los ocupados.
            
            2# Solo 1 asiento puede ser ocupado por persona, si el asiento
                ya se encuentra ocupado debe permitir a la persona elegir
                otro. .
                
            3# Para finalizar el programa se deberá ingresas el valor
                "99". No hay un límite de veces que el programa se puede 
                ejecutar.
        
            4# Solo hay 10 filas y 10 asientos por fila. No se puede seleccionar
                un asiento fuera de ese rango.
        
            5# No se puede utilizar GUI ni BD. Solo se debe usar desarrollo
                lógico.
                
            6# En caso de que el quiente lo desee deberá poder ver en consola
                la representación "grafica" de los asientos libres y ocupados.
                        
        */
        // ASIGNA A TODOS LOS ASIENTOS COMO LIBRES
        
        char anfiteatro[][] = new char [10][10];
        Scanner teclado = new Scanner(System.in);
        int fila, asiento;
        boolean finPrograma = false;
        String respuesta;
        
        
        for(int f=0;f<10;f++){
            for(int a=0;a<10;a++){
                anfiteatro[f][a] = 'L';
            }
        }
        // ----------------------------------------
        System.out.println("----- Bienvenido al sistema de tickets ------");
        // INGRESO POR TECLADO DE FILA Y ASIENTO
        while(finPrograma !=true){
            
            
            System.out.println("A continuación debe ingresar la fila y asiento.");
            System.out.println("Primero indique cual es la fila, ingrese el número correspondiente "
                    + " del 1 al 10:");
            fila = teclado.nextInt()-1;
            System.out.println("Ahora indique cual es el asiento de la fila "+(fila+1)+".");
            asiento=teclado.nextInt()-1;
            System.out.println("Usted seleccionó la fila "+(fila+1)+" y el asiento "+(asiento+1)+".");
            
            if(fila < 1 || fila > 10 || asiento < 1 || asiento > 10 ){
                System.out.println("ATENCIÓN: La fila y/o asiento ingresado no existe.");
                System.out.println("Intente nuevamente.");
                System.out.println("++++++++++++++++++++++++++++++++++++++++");
                continue;
            }
            
            if(anfiteatro[fila][asiento]=='L'){
               anfiteatro[fila][asiento]='X';
               
           
            //********* MAPA DE ASIENTOS *********
                System.out.println("------------------------------------------------");
                System.out.println("Mapa de asientos ocupados (X) y libres (L) ");
                System.out.println("------------------------------------------------");
                System.out.println("Asiento: 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 ");
                System.out.println("------------------------------------------------");
                for(int x=0;x<10;x++){
                    if(x<9){
                        System.out.print("Fila " + (x+1) + ":  ");
                    }else{
                        System.out.print("Fila " + (x+1) + ": ");
                    }

                    for(int i=0;i<10;i++){
                        System.out.print(anfiteatro[x][i] + " | "); 
                    }
                    System.out.println(" ");

                }
                    System.out.println("************************************************");
                    System.out.println("Perfecto, se registró su asiento en sistema.");
                    System.out.println("************************************************");
            // --------------------------------------------
            }else{
                 System.out.println("************************************************");
                System.out.println("ATENCIÓN: Ese asiento no se encuentra disponible, "
                        + "seleccione otro por favor.");
            }
            System.out.println("¿Ha finalizado el ingreso de asientos?");
            System.out.println("Ingrese la letra S para finalizar, o ingrese"
                    + " cualquier letra o número para seguir asignando.");
            respuesta = teclado.next();
            
            if(respuesta.equalsIgnoreCase("S")){
                finPrograma = true;
            }
            
            System.out.println("************************************************");

        
        

        // ----------------------------------------
        } 
        
        
        
        
        
    }
}
