/**
 * 
 * @author eduardo bocanegra
 *
 */

public class Persona {

	/**
	 * Atributo privado nombre
	 */
	private String nombre;
	/**
	 * Atributo privado dni
	 */
	private String dni;
	/**
	 * Atributo privado edad
	 */
	private String edad;
	
	/**
	 * 
	 * @param nombre atributo de tipo String
	 * @param dni atributo de tipo String
	 * @param edad atributo de tipo String
	 */
	public Persona(String nombre, String dni, String edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	/**
	 * Metodo para sacar el nombre
	 * @return nombre de tipo String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo para estabñecer un nombre
	 * @param nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Es un metodo para sacar el Dni
	 * @return dni de tipo String
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Es un metodo para establecer Dni
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * El metodo para sacar la edad
	 * @return edad de tipo String
	 */
	public String getEdad() {
		return edad;
	}
	
	/**
	 * Metodo para establecer la edad
	 * @param edad
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
 
	@Override
	public String toString() {
		return "Persona [El cliente" + nombre + ", con Dni" + dni + ", tiene la edad de" + edad + "]";
	}
	
}
