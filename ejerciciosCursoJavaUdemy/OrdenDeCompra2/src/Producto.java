public class Producto {

    private String fabricante, nombre;
    private Integer precio;

    public Producto(String fabricante, String nombre, Integer precio){
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String verDetalle(){
        return  " Fabricante: "+this.fabricante+ ". Nombre: "+this.nombre+". Precio: "+this.precio;
    }

    public String pedirPack(Integer pack){
        String packEntrega = "Se entrega pack de "+(pack*8)+" paquetes de "+this.nombre+", marca "+this.fabricante;
        return packEntrega;
    }

}
