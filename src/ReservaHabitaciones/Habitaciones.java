package ReservaHabitaciones;

/**
 * clase abstracta habitaciones que será heredada por la clase Suit y la clase Dobles
 */
public abstract class Habitaciones {
    //atributos de la clase
    protected int numeroHabitacion;
    protected String estado;
    protected int numeroCamas;

    //constructor vacío
    public Habitaciones() {

    }

    /**
     * Constructor del objeto habstracto habitacion
     *
     * @param habitacion el numero de la habitacion
     * @param est        el estado de la habitracion
     * @param camas      la cantidad de camas que tiene la habitacion
     */
    public Habitaciones(int habitacion, String est, int camas) {
        numeroHabitacion = habitacion;
        estado = est;
        numeroCamas = camas;
    }

    /**
     * metodo setter para el estado
     *
     * @param estado el estado de la habitacion
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * metodo setter para el numero de camas que tiene la habitacion
     *
     * @param numeroCamas el numero de camas
     */
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    /**
     * metodo setter para el numero de la habitacion
     *
     * @param numeroHabitacion el numero de habitacion
     */
    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    /**
     * metodo que devuelve el numero de camas
     *
     * @return numero de camas
     */
    public int getNumeroCamas() {
        return numeroCamas;
    }

    /**
     * metodo que devuelve el numero de habitacion
     *
     * @return el numero de habitacion
     */
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    /**
     * metodo que devuelve el estado de la habitacion
     *
     * @return el estado de la habitacion
     */
    public String getEstado() {
        return estado;
    }
}
