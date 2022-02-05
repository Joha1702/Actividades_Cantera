package Clases;

/*
 * Clase Pa�s: representa un pa�s con sus atributos principales como nombre, area, poblaci�n, idioma y ciudad capital
 * y con sus m�todos get y Set para acceder a sus atributos.
 * @Author: Leidy Johana Moreno
 */

public class Country {
	
	/*
	 * Atributo que representa el nombre del pa�s
	 */
	public String name;
	
	/*
	 * Atributo que representa area en kilometros cuadrados del pa�s
	 */
	private float area;
	
	/*
	 * Atributo que representa la poblaci�n del pa�s
	 */
	public int population;
	
	/*
	 * Atributo que representa el idioma del pa�s
	 */
	private String language;
	
	/*
	 * Atributo que indica cual es la ciudad capital del pa�s
	 */
	private String capitalCity;
	
	
	/*
	 * M�todo set que permite asignar el nombre al pa�s, recibe como parametros el atributo nombre de tipo String
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * M�todo get que me devuelve el nombre del objeto pa�s
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * M�todo set que permite asignar el area al pa�s, recibe como parametros el atributo area de tipo float
	 */
	public void setArea(float area) {
		this.area = area;
	}
	
	/*
	 * M�todo get que me devuelve el area del objeto pa�s
	 */
	public float getarea() {
		return area;
	}
	
	/*
	 * M�todo set que permite asignar la poblaci�n del pa�s, recibe como parametros el atributo poblaci�n de tipo int
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	
	/*
	 * M�todo get que me devuelve la poblaci�n del objeto pa�s
	 */
	public float getPopulation() {
		return population;
	}
	
	/*
	 * M�todo set que permite asignar el idioma del pa�s, recibe como parametros el atributo idioma de tipo String
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	/*
	 * M�todo get que me devuelve el idioma del pa�s
	 */
	public String getLanguage() {
		return language;
	}
	
	/*
	 * M�todo set que permite asignar la capital del pa�s, recibe como parametros el atributo ciudad capital de tipo String
	 */
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	
	/*
	 * M�todo get que me devuelve la ciudad capital del objeto pa�s
	 */
	public String getCapitalCity() {
		return capitalCity;
	}
	
	

}
