package Clases;

/*
 * clase que representa un electrodoméstico y sus atributos y métodos principales
 */
public class HomeAppliance {
	
	/*
	 * nombre del electrodoméstico
	 */
	public String name;
	
	/*
	 * tamaño del electrodoméstico
	 */
	public float size;
	
	/*
	 * peso del electrodoméstico
	 */
	public float weight;
	
	/*
	 * material de fabricación del electrodoméstico
	 */
	protected String material;
	
	/*
	 * valor del electrodoméstico
	 */
	private double value;
	
	
	/*
	 * Método set para asigna el material del electrodoméstico.
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	
	/*
	 * Método get para consultar el material del electrodoméstico.
	 */
	public String getMaterial() {
		return material;
	}
	
	/*
	 * Método set para el valor del electrodoméstico.
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
	/*
	 * Método get para consultar el valor del electrodoméstico.
	 */
	public double getValue() {
		return value;
	}
	
	
	/*
	 * Método para encender el electrodoméstico, recibe como parametro el nombre de este.
	 */
	public String turnOn(String name) {
		String message = name+ " esta encendido";
		return message;
	}
	
	/*
	 * Método para apagar el electrodoméstico, recibe como parametro el nombre de este.
	 */
	public String turnOff(String name) {
		String message = name+ " esta apagado";
		return message;
	}

}
