package ReservaHabitaciones;

/**
 * Clase clientes
 * 
 * @author celia
 * @version 2
 */
public class Clientes {
//atributos de la clase cliente
	private int numeroCliente;
	private String nombre;
	private int telefono;

	/**
	 * Constructor clientes que permitirá crear un objeto
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
	 * Método getter para numero cliente
	 * 
	 * @return numero del cliente
	 */
	public int getNumeroCliente() {
		return numeroCliente;
	}

	/**
	 * Método setter para numero de cliente
	 * 
	 * @param numeroCliente numero de cliente
	 */
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	/**
	 * Método getter nombre del cliente
	 * 
	 * @return Nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo setter para el nombre del cliente
	 * 
	 * @param nombre Nombre del cliente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo getter para el numero de telefono del cliente
	 * 
	 * @return numero del cliente
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Metodo setter para el numero del telefono del cliente
	 * 
	 * @param telefono Telefono del cliente
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
