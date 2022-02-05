package Clases;

/*
 * clase que representa un electrodom�stico y sus atributos y m�todos principales
 */
public class HomeAppliance {
	
	/*
	 * nombre del electrodom�stico
	 */
	public String name;
	
	/*
	 * tama�o del electrodom�stico
	 */
	public float size;
	
	/*
	 * peso del electrodom�stico
	 */
	public float weight;
	
	/*
	 * material de fabricaci�n del electrodom�stico
	 */
	protected String material;
	
	/*
	 * valor del electrodom�stico
	 */
	private double value;
	
	
	/*
	 * M�todo set para asigna el material del electrodom�stico.
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	
	/*
	 * M�todo get para consultar el material del electrodom�stico.
	 */
	public String getMaterial() {
		return material;
	}
	
	/*
	 * M�todo set para el valor del electrodom�stico.
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
	/*
	 * M�todo get para consultar el valor del electrodom�stico.
	 */
	public double getValue() {
		return value;
	}
	
	
	/*
	 * M�todo para encender el electrodom�stico, recibe como parametro el nombre de este.
	 */
	public String turnOn(String name) {
		String message = name+ " esta encendido";
		return message;
	}
	
	/*
	 * M�todo para apagar el electrodom�stico, recibe como parametro el nombre de este.
	 */
	public String turnOff(String name) {
		String message = name+ " esta apagado";
		return message;
	}

}
