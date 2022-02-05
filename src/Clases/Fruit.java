package Clases;

import java.util.ArrayList;

/*
 * Clase Fruta: Representa una fruta con sus principales atributos y m�todos.
 * @author Leidy Johana Moreno
 */

public class Fruit {

	/*
	 * nombre de la fruta
	 */
	public String name;
	
	/*
	 * peso promedio de la fruta en gramos
	 */
	private float averageWeight;
	
	/*
	 * colores de la fruta
	 */
	public ArrayList<String> colors;
	
	/*
	 * pais origen de la fruta
	 */
	protected String countryOrigin;
	
	/*
	 * representa el valor por gramo de la fruta
	 */
	private float gramValue;
	
	/*
	 * M�todo constructor que inicializa el atributo Colores de la fruta.
	 */
	public Fruit() {
		colors = new ArrayList<String>();
	}
	
	
	/*
	 * M�todo Set que asigna los posibles colores de la fruta
	 */
	public void setColor(String color) {
		colors.add(color);
	}
	
	/*
	 * M�todo get que devuelve una lista con los colores de la fruta
	 */
	public ArrayList<String> getColors(){
		return colors;
	}
	
	/*
	 * M�todo Set que asigna el peso promedio de la fruta
	 */
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}
	
	/*
	 * M�todo get que devuelve el peso promedio de la fruta
	 */
	public float getAverageWeight(){
		return averageWeight;
	}
	
	/*
	 * M�todo set asigna el nombre de la fruta
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * M�todo get que devuelve nombre de la fruta
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * M�todo set que asgina el nombre de pa�s origen de la fruta
	 */
	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
	/*
	 * m�todo get que devuelve el nombre del pais origen de la fruta
	 */
	public String getCountryOrigin() {
		return countryOrigin;
	}
	
	/*
	 * M�todo que calcula el valor promedio de la fruta segun su peso promedio y valor del gramo
	 */
	public float averageValue() {
		float valueFruit = averageWeight * gramValue;
		return valueFruit;
	}
}
