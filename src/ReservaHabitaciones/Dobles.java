package ReservaHabitaciones;

/**
 * Clase Dobles que hereda de Habitaciones
 */
public class Dobles extends Habitaciones {
    //atributos del objeto dobles
    protected boolean minibar;

    //constructor vacio
    public Dobles() {

    }

    /**
     * Constructor del objeto Dobles queheredará tambien los atributos de su clase padre
     *
     * @param habitacion el identificador de la habitacion
     * @param estado     el estado en el que está la habitación
     * @param camas      la cantidad de camas que tiene la habitación
     * @param minibar    si tiene minibar o no
     */
    public Dobles(int habitacion, String estado, int camas, boolean minibar) {
        super(habitacion, estado, camas);
        this.minibar = minibar;
    }

    /**
     * setter para mininbar
     *
     * @param minibar si tiene minibar o no
     */
    public void setMinibar(boolean minibar) {
        this.minibar = minibar;
    }

    /**
     * Metodo para saber si tiene minibar o no
     *
     * @return true si tiene minibar, false si no
     */
    public boolean isMinibar() {
        return minibar;
    }

    /**
     * calcula los descuentos aplicados a la habitacion
     *
     * @return el descuento
     */
    public int calculoDescuentos() {
        int calculo = 0;
        return calculo;
    }
}
