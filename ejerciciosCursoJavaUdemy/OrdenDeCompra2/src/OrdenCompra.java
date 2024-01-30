/*
La tarea es crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente manera:

Se requiere crear la clase OrdenCompra con los siguientes campos privados:
identificador tipo Integer autoincremental, descripcion String, fecha tipo Date,
cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con
 4 elementos: Producto[] productos.

- IDENTIFICADOR INTEGER AUTOINCREMENTAL [ ]
- DESCRIPCIÓN STRING [OK]
- FECHA DATE [OK] + OPCIÓN DE ELEGIR OTRA FECHA [OK]
- CLASE CLIENTE [OK]
- ARRAY DE PRODUCTOS CON 4 ELEMENTOS [OK]

En la clase OrdenCompra, crear constructor que inicialice solo la descripción.

En la clase OrdenCompra, crear métodos getter para todos los atributos.

En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.

Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando
el método public void addProducto (Producto producto), nada más, es decir no se
pueden agregar en el constructor ni en métodos setter.

La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los
precios de los productos.

Crear la clase Producto con tres atributos fabricante tipo String y nombre String
y precio int, inicializar todos sus valores en el constructor e implementar sus
respectivos métodos getter.

Crear la clase Cliente con dos atributos nombre y apellido, inicializar todos sus
valores en el constructor e implementar sus respectivos métodos getter.

Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:

Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro
productos a cada una, cada orden con distintos productos, que no se repitan.

Para cada una imprimir sus valores en consola usando método getter incluyendo los
productos, donde con el método getter obtenemos el arreglo de productos y con un
foreach recorremos e imprimimos sus atributos fabricante, nombre y precio. Tener
en cuenta en la salida el gran total de cada orden, los clientes, todo.
*
*
* */


import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class OrdenCompra {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //CARGAR LA FECHA ACTUAL
        Date fecha = new Date();
        SimpleDateFormat diaMesAnio = new SimpleDateFormat("dd MM yyyy");
        String fechaStr = diaMesAnio.format(fecha);

        //ELECCION DEL USUARIO: FECHA ACTUAL O MODIFICADA
        System.out.println("Quiere utilizar la fecha actual o va a utilizar otra fecha");
        System.out.println("Escriba 1 para usar la actual, o 2 para colocar otra fecha");
        int eleccionFecha = teclado.nextInt();
        int dia, mes, anio;

        if (eleccionFecha == 2){
            System.out.print("Ingrese el día: ");
            dia = teclado.nextInt();
            System.out.print("Ingrese el mes: ");
            mes = teclado.nextInt();
            System.out.print("Ingrese el año: ");
            anio = teclado.nextInt();

            //MODIFICAR FECHA ACTUAL
            Calendar calendario = Calendar.getInstance();
            calendario.set(anio,mes-1,dia);
            fecha = calendario.getTime();
            fechaStr = diaMesAnio.format(fecha);
        }
        System.out.println(fechaStr);




        Integer identificador; //DEBE SER AUTOINCREMENTAL
      String descripcion;


      // *********** CLIENTES ************

      Cliente cli1 = new Cliente("Juan", "Gonzalez",12341234);

      // *********** PRODUCTOS ************

        Producto[] productosLst = new Producto[4];
        productosLst[0] = new Producto("Knor","Caldo",5);
        productosLst[1] = new Producto("Sprite", "Gaseosa de 2.5L", 3);
        productosLst[2] = new Producto("Playadito", "Yerba 1kg", 5);
        productosLst[3] = new Producto("Ledezma", "Azucar 1kg", 2);


        System.out.println(productosLst[0].verDetalle());
        System.out.println(productosLst[1].verDetalle());



Producto fideoMarolio = new Producto("Marolio", "Fideos", 25);

Producto caramelosArcor = new Producto("Arco", "Caramelos", 12);

//LLAMANDO AL MÉTODO, IMPRIMIENDO POR CONSOLA
System.out.println(fideoMarolio.verDetalle());
System.out.println(caramelosArcor.verDetalle());
System.out.println("---------------------------");
System.out.println(fideoMarolio.pedirPack(4));
        System.out.println(caramelosArcor.pedirPack(2));



        }
    }
