import java.util.Scanner;
public class MatrizEnX {

    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al generador de matriz en X simétrica.");
        System.out.println("Ingrese el tamaño de la matriz. Ej. 2 para 2x2, 3 para 3x3, etc.");

            int n = teclado.nextInt();
            int[][] matriz = new int[n][n];
        System.out.println("Generando X en matriz de "+n+" x "+n+".");
        System.out.println(" ");
            int i, j;

            for (i = 0; i < matriz.length; ++i) {
                for (j = 0; j < matriz[i].length; ++j) {
                    if ( i == j || j == matriz.length - i - 1){
                        System.out.print("\t X");
                    }else{
                        System.out.print("\t _");
                    }
                }
                System.out.println(" ");
            }
    }
}