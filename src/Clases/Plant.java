package Clases;
/*
 * Clase que representa un planta con sus atributos y m�todos principales
 * @Author: Leidy Johana Moreno L�pez
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
	 * tama�o de la planta
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
	 * M�todo set para asignar el tama�o de la planta, recibe como parametro el tama�o.
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	/*
	 * M�todo get para consultar el tama�o de la planta
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
	 * M�todo get que permite consultar el tipo de planta.
	 */
	public String getLandType() {
		return landType;
	}
	
	/*
	 * M�todo para sembrar una planta, recibe como parametros su nombre y el tipo de terreno
	 */
	public String plant(String name, String landType) {
		String messagePlant = "Se siembra la planta "+name + "en el terreno "+landType;
		return messagePlant;
	}
	
	/*
	 * M�todo para regar una planta, recibe como parametro el nombre de la planta y la cantidad de agua en litros.
	 */
	public String wateringPlant(String name, float waterQuantity) {
		String message = "Se riega la planta "+name+ " con "+waterQuantity + " litros de agua";
		return message;
	}
	

}
