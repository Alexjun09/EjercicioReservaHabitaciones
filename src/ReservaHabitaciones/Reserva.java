package ReservaHabitaciones;

/**
 * 
 * @author celia
 * @version 2
 *
 */
public class Reserva {
	// atributos de la clase reserva
	private int numeroReserva;
	private int fechaEntrada;
	private int fechaSalida;
	private int numeroPersonas;

	/**
	 * Constructor reserva que permitirá crear un objeto
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
	 * Metodo getter numero de la reserva
	 * 
	 * @return Numero de la reserva
	 */
	public int getNumeroReserva() {
		return numeroReserva;
	}

	/**
	 * Metodo setter numero de la reserva
	 * 
	 * @param numeroReserva Numero de la reserva
	 */
	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}

	/**
	 * Metodo getter de la fecha de entrada
	 * 
	 * @return Fecha de entrada
	 */
	public int getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * Metodo setter de la fecha de entrada
	 * 
	 * @param fechaEntrada Fecha de entrada
	 */
	public void setFechaEntrada(int fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * Metodo getter de la fecha de salida
	 * 
	 * @return Fecha de salida
	 */
	public int getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * Metodo setter de la fecha de salida
	 * 
	 * @param fechaSalida Fecha de salida
	 */
	public void setFechaSalida(int fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * Metodo getter del numero de personas
	 * 
	 * @return Numero de personas
	 */
	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	/**
	 * Metodo setter del numero de personas
	 * 
	 * @param numeroPersonas Numero de personas
	 */
	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}
}
