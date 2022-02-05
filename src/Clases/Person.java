package Clases;
import java.util.Calendar;
import java.util.Date;

/*
 * Calse que representa una persona con sus principales atributos y m�todos.
 * @author: Leidy Johana Moreno
 */

public class Person {
	
	/*
	 * Nombre de la persona
	 */	
	public String name;
	
	/*
	 * Primer apellido de la persona
	 */
	public String lastName1;
	
	/*
	 * Segundo apellido de la persona
	 */
	public String lastName2;
	
	/*
	 * Fecha nacimiento de la persona
	 */
	public Date dateBirth;
	
	/*
	 * Estatura de la persona
	 */
	public float height;
	
	
	/*
	 * M�todos Set que permite asignar el nombre a una persona.
	 * @param name: nombre de la persona
	 */
	
	public void setName (String name) {
		this.name = name;
	}
	
	/*
	 * M�todo get que me devuelve el nombre de una persona
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * M�todo Set que permite asignar el primer apellido de una persona.
	 * @param lastName1: primer apellido de la persona de tipo String
	 */
	public void setLastName1 (String lastName1) {
		this.lastName1 = lastName1;
	}
	
	/*
	 * M�todo get que me devuelve el primer apellido de una persona
	 */
	public String getLastName1() {
		return lastName1;
	}
	
	/*
	 * M�todo Set que permite asignar el segundo apellido a una persona.
	 * @param lastName2: segundo apellido de la persona de tipo String
	 */
	public void setLastName2 (String lastName2) {
		this.lastName2 = lastName2;
	}
	
	/*
	 * M�todo get que me devuelve el segundo apellido de una persona
	 */
	public String getLastName2() {
		return lastName2;
	}
	
	/*
	 * M�todo Set que permite asignar la fecha de nacimiento de una persona.
	 * @param dateBith: fecha de nacimiento de una persona de tipo Date
	 */
	public void setDateBirth (Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	
	/*
	 * M�todo get que me devuelve la fecha de nacimiento de una persona
	 */
	public Date getDateBirth() {
		return dateBirth;
	}
	
	/*
	 * M�todo Set que permite asignar la estatura a una persona.
	 * @param height: estatura de la persona
	 */
	public void setHeight (float height) {
		this.height = height;
	}
	
	/*
	 * M�todo get que me devuelve la estatura de una persona
	 */
	public float getHeight() {
		return height;
	}
	
		
	/*
	 * M�todo para calcular la edad de una persona recibiendo como parametros su fecha de nacimiento.
	 * @param dateBirth fecha de nacimiento de la persona.
	 * Se instancia la clase Calendar con el nombre dateBirth2 y a esta le vamos a asignar la fecha de
	 * nacimiento que recibimos como parametro.
	 * se instancia nuevamente la clase Calendar con el nombre currentDate
	 * con el atributo year se calcula los a�os de la fecha actual - a�os de la fecha de nacimiento
	 * 
	 * @return devuelve los a�os de edad.
	 */
	
	private int calculateAge(Date dateBirth) {
		
		   Calendar dateBirth2 = Calendar.getInstance();
	       Calendar currentDate = Calendar.getInstance();
	       dateBirth2.setTime(dateBirth);

	       int year = currentDate.get(Calendar.YEAR)- dateBirth2.get(Calendar.YEAR);

	       
	       return year;
	}
	
	
	/*
	 * M�todo para acceder a la edad de una persona
	 * en este se llama al m�todo calcular edad enviandole como parametro su fecha de nacimiento
	 */
	
	public int getAge() {
		return calculateAge(dateBirth);
	}
	
	
}

