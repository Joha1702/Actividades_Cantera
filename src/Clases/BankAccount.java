/*
 * Representa los atributos y métodos princiapales de una cuenta bancaria.
 * @author: Leidy Johana Moreno
 */

package Clases;


public class BankAccount {
	
	/*
	 * Atributo que representa el número de cuenta bancaria.
	 */	
	private int accountNumber;
	
	/*
	 * Atributo que representa si la cuenta esta activa o no.
	 */
	protected boolean activated;
	
	/*
	 * Atributo que representa el propierario de la cuenta bancaria.
	 */
	private String accountOwner;
	
	/*
	 * Atributo que representa el saldo de la cuenta.
	 */
	private float accountBalance; 
	
	/*
	 * Método Set que permite asignar activar o desactivar la cuenta bancaria.
	 * @param activated indica con un verdadero o falso si la cuenta esta activa o inactiva.
	 */	
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
	/*
	 * Método get que devuelve el estado verdadero si la cuenta esta activo o falso si la cuenta esta inactiva.
	 */
	public boolean getActivated() {
		return activated;
	}
	
	/*
	 * Método Set que permite asignar el número de cuenta a la cuenta bancaria.
	 * @param accountNumber número de la cuenta.
	 */	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/*
	 * Método get que devuelve el numero de la cuenta bancaria.
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	
	/*
	 * Método Set que permite asignar el nombre del propietario a la cuenta bancaria.
	 * @param accountOwner indica el nombre del propietario de la cuenta bancaria.
	 */	
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	
	/*
	 * Método get que devuelve el nombre del propietario de la cuenta bancaria.
	 */
	public String getAccountOwner() {
		return accountOwner;
	}
	
	/*
	 * Método para depositar en la cuenta bancaria
	 * @param value: valor a depositar
	 */
	public void deposit (float value) {
		accountBalance = accountBalance + value; 
	}
	
	/*
	 * Método para retirar de la cuenta bancaria
	 * @param value: valor a retirar
	 * @return devuelve un mensaje si se pudo o no retirar el valor.
	 */
	public String removeBalance(float value) {
		
		String message;
		if (value <= accountBalance) {
			accountBalance = accountBalance - value;
			message = "Se retira "+value+ "de su cuenta bancaria";
		}else {
			message = "el valor a retirar excede el saldo de su cuenta";
		}
		
		return message;
	}
	
	/*
	 * Método para consultar el saldo de la cuenta bancaria
	 */	
	public float getAccountBalance() {
		return accountBalance;
	}

}
