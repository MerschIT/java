public class BuscarT {
    public static void main(String[] args) {
        String palabras = "tres tristes tigres comen trigo en un trigal";

        int max = palabras.length();
        int contador = 0;
        for(int i =0;i<max;i++){
            if(palabras.charAt(i)== 't') {
                contador++;

            }

        }
        System.out.println("Hay "+contador+" letras T");
    }
}
