public class Cliente {
    private String nombre, apellido, telefono;
    private static int ultimoID;
    private int idCliente;

    public Cliente(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.idCliente = ultimoID++;
    }

    public String getCliente(){
        return  nombre+" "+apellido+" . Telefono: "+telefono+". Cliente N°: "+idCliente;
    }
}
