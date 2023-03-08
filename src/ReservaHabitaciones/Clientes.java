package ReservaHabitaciones;

/**
 * Esta clase almacena toda la informacion necesaria  respecto a los clientes
 *
 * @author Celia Rubio
 * @version 2
 */
public class Clientes {
    //atributos de la clase cliente
    private int numeroCliente;
    private String nombre;
    private int telefono;

    /**
     * Constructor clientes que permitirá crear un objeto de tipo cliente
     *
     * @param cliente Numero del cliente
     * @param nombre  Nombre del cliente
     * @param telef   Telefono del cliente
     */
    public Clientes(int cliente, String nombre, int telef) {
        numeroCliente = cliente;
        this.nombre = nombre;
        telefono = telef;
    }

    /**
     * Metodo que permite anular una reserva
     *
     * @param reserva la reserva que se desea anular
     */
    public void anularReserva(Reserva reserva) {
        reserva = null;
    }

    /**
     * Metodo que permitirá que el cliente haga una reserva
     *
     * @param reserva  el numero de reserva
     * @param entrada  la entrada a la habitacion
     * @param salida   la salida de la habitacion
     * @param personas la cantidad de personas para las que se realiza la reserva
     * @return se ha hecho correctamente la reserva
     */
    public String crearReserva(int reserva, int entrada, int salida, int personas) {
        Reserva reserva1 = new Reserva(reserva, entrada, salida, personas);
        return "Reserva hecha correctamente";
    }

    /**
     * Método getter que devolverá el numero de cliente
     *
     * @return numero del cliente
     */
    public int getNumeroCliente() {
        return numeroCliente;
    }

    /**
     * Método setter que permitirá cambiar el numero de cliente
     *
     * @param numeroCliente nuevo numero de cliente
     */
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    /**
     * Método getter que devolverá el nombre del cliente
     *
     * @return Nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setter que permitirá cambiar el nombre del cliente
     *
     * @param nombre nuevo Nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo getter que devolverá el numero de telefono del cliente
     *
     * @return numero del cliente
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Metodo setter que permitirá cambiar el numero del telefono del cliente
     *
     * @param telefono nuevo Telefono del cliente
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
