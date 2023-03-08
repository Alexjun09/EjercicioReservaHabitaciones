package ReservaHabitaciones;

/**
 * Esta clase almacena toda la informacion necesaria  respecto a las reservas
 *
 * @author Celia Rubio
 * @version 2
 */
public class Reserva {
    // atributos de la clase reserva
    private int numeroReserva;
    private int fechaEntrada;
    private int fechaSalida;
    private int numeroPersonas;

    /**
     * Constructor reserva que permitirá crear un objeto de tipo reserva
     *
     * @param reserva  Numero de la reserva
     * @param entrada  Fecha de entrada
     * @param salida   Fecha de salida
     * @param personas Numero de personas
     */
    public Reserva(int reserva, int entrada, int salida, int personas) {
        numeroReserva = reserva;
        fechaEntrada = entrada;
        fechaSalida = salida;
        numeroPersonas = personas;
    }

    /**
     * Este metodo permite actualizar una reserva ya existente
     * @param reserva el numero de la reserva
     * @param entrada la fecha de entrada
     * @param salida la fecha de salida
     * @param personas el numero de personas
     */
    public void modificarReserva(int reserva, int entrada, int salida, int personas) {
        numeroReserva = reserva;
        fechaEntrada = entrada;
        fechaSalida = salida;
        numeroPersonas = personas;
    }

    /**
     * Metodo getter devolverá el numero de la reserva
     *
     * @return Numero de la reserva
     */
    public int getNumeroReserva() {
        return numeroReserva;
    }

    /**
     * Metodo setter que permitirá cambiar el numero de la reserva
     *
     * @param numeroReserva Numero de la reserva
     */
    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    /**
     * Metodo getter que devolverá la fecha de entrada
     *
     * @return la Fecha de entrada
     */
    public int getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Metodo setter que cambiará la fecha de entrada
     *
     * @param fechaEntrada Fecha de entrada
     */
    public void setFechaEntrada(int fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * Metodo getter que devolverá la fecha de salida
     *
     * @return Fecha de salida de la habitacion
     */
    public int getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Metodo setter que cambiará la fecha de salida
     *
     * @param fechaSalida Fecha de salida
     */
    public void setFechaSalida(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * Metodo getter que devolverá el numero de personas que hay en la reserva
     *
     * @return Numero de personas
     */
    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    /**
     * Metodo setter que cambiará el numero de personas que estan en la reserva
     *
     * @param numeroPersonas Numero de personas que han reservado
     */
    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
}
