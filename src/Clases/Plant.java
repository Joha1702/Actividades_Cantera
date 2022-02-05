package Clases;
/*
 * Clase que representa un planta con sus atributos y métodos principales
 * @Author: Leidy Johana Moreno López
 */

public class Plant {
	
	/*
	 * nombre de la planta
	 */
	public String name;
	
	/*
	 * color de la planta
	 */
	public String color;
	
	/*
	 * tamaño de la planta
	 */
	private float height;
	
	/*
	 * Tipo de planta (frutal, ornamental, floral)
	 */
	public String plantType;
	
	/*
	 * tipo de terreno idea para sembrar la planta (arido, humedo, etc)
	 */
	protected String landType;
	
	
	/*
	 * Método set para asignar el tamaño de la planta, recibe como parametro el tamaño.
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	/*
	 * Método get para consultar el tamaño de la planta
	 */
	public float getHeight() {
		return height;
	}
	
	/*
	 * Metodo set para asignar el tipo de planta, recibe como parametro un String
	 */
	public void setlantType(String landType) {
		this.landType = landType;
	}
	
	/*
	 * Método get que permite consultar el tipo de planta.
	 */
	public String getLandType() {
		return landType;
	}
	
	/*
	 * Método para sembrar una planta, recibe como parametros su nombre y el tipo de terreno
	 */
	public String plant(String name, String landType) {
		String messagePlant = "Se siembra la planta "+name + "en el terreno "+landType;
		return messagePlant;
	}
	
	/*
	 * Método para regar una planta, recibe como parametro el nombre de la planta y la cantidad de agua en litros.
	 */
	public String wateringPlant(String name, float waterQuantity) {
		String message = "Se riega la planta "+name+ " con "+waterQuantity + " litros de agua";
		return message;
	}
	

}
