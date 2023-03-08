package ReservaHabitaciones;

/**
 * Clase Suit que hereda de Habitaciones. Esta clase almacena toda la informacion necesaria para la reserva de habitaciones de tipo Suit
 *
 * @author Alejandro Junyent
 * @version 1
 */
public class Suit extends Habitaciones {
    //atributos especificos de la clase
    protected int metros;
    protected String servicios;

    //constructor vacío
    public Suit() {

    }

    /**
     * constructor suit que heredará los atributos de su clase padre habitaciones
     *
     * @param habitacion el codigo de la habitacion
     * @param estado     el estado en el que está la habitaciçón
     * @param camas      la cantidad de camas que tiene la habitación
     * @param metros     la cantidad de metros que tiene la habitación
     * @param servicios  los servicios que tiene la habitación
     */
    public Suit(int habitacion, String estado, int camas, int metros, String servicios) {
        super(habitacion, estado, camas);
        this.metros = metros;
        this.servicios = servicios;
    }

    /**
     * metodo setter de los metros de la suit
     *
     * @param metros los metros que tiene
     */
    public void setMetros(int metros) {
        this.metros = metros;
    }

    /**
     * metodo setter de los servicios que tiene esa suit
     *
     * @param servicios los servicios que tiene la suit
     */
    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    /**
     * metodo que devuelve los metros cuadrados de la suit
     *
     * @return los metros
     */
    public int getMetros() {
        return metros;
    }

    /**
     * metodo que devuelve los servicios de la suit
     *
     * @return los servicios
     */
    public String getServicios() {
        return servicios;
    }

    /**
     * metodo que calcula los gastos de la suit
     *
     * @return los gastos de la suit
     */
    public int calculoGastos() {
        int calculogastos = 0;
        return calculogastos;
    }
}
