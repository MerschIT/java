public class Compras {
    private int identificador;
    private static int ultimoId;
    private String descripcion;

   //CONSTRUCTOR DE COMPRAS
    public Compras(String descripcion){
        this.descripcion = descripcion;
        this.identificador = ++ultimoId;
    }

    public int getIdentificador(){
        return identificador;
    }

    public String getDescripcion(){
        return descripcion;
    }

}
