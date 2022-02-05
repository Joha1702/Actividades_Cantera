package Clases;

/*
 * Clase País: representa un país con sus atributos principales como nombre, area, población, idioma y ciudad capital
 * y con sus métodos get y Set para acceder a sus atributos.
 * @Author: Leidy Johana Moreno
 */

public class Country {
	
	/*
	 * Atributo que representa el nombre del país
	 */
	public String name;
	
	/*
	 * Atributo que representa area en kilometros cuadrados del país
	 */
	private float area;
	
	/*
	 * Atributo que representa la población del país
	 */
	public int population;
	
	/*
	 * Atributo que representa el idioma del país
	 */
	private String language;
	
	/*
	 * Atributo que indica cual es la ciudad capital del país
	 */
	private String capitalCity;
	
	
	/*
	 * Método set que permite asignar el nombre al país, recibe como parametros el atributo nombre de tipo String
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * Método get que me devuelve el nombre del objeto país
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * Método set que permite asignar el area al país, recibe como parametros el atributo area de tipo float
	 */
	public void setArea(float area) {
		this.area = area;
	}
	
	/*
	 * Método get que me devuelve el area del objeto país
	 */
	public float getarea() {
		return area;
	}
	
	/*
	 * Método set que permite asignar la población del país, recibe como parametros el atributo población de tipo int
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	
	/*
	 * Método get que me devuelve la población del objeto país
	 */
	public float getPopulation() {
		return population;
	}
	
	/*
	 * Método set que permite asignar el idioma del país, recibe como parametros el atributo idioma de tipo String
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	
	/*
	 * Método get que me devuelve el idioma del país
	 */
	public String getLanguage() {
		return language;
	}
	
	/*
	 * Método set que permite asignar la capital del país, recibe como parametros el atributo ciudad capital de tipo String
	 */
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	
	/*
	 * Método get que me devuelve la ciudad capital del objeto país
	 */
	public String getCapitalCity() {
		return capitalCity;
	}
	
	

}
