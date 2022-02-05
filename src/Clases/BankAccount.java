/*
 * Representa los atributos y m�todos princiapales de una cuenta bancaria.
 * @author: Leidy Johana Moreno
 */

package Clases;


public class BankAccount {
	
	/*
	 * Atributo que representa el n�mero de cuenta bancaria.
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
	 * M�todo Set que permite asignar activar o desactivar la cuenta bancaria.
	 * @param activated indica con un verdadero o falso si la cuenta esta activa o inactiva.
	 */	
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
	/*
	 * M�todo get que devuelve el estado verdadero si la cuenta esta activo o falso si la cuenta esta inactiva.
	 */
	public boolean getActivated() {
		return activated;
	}
	
	/*
	 * M�todo Set que permite asignar el n�mero de cuenta a la cuenta bancaria.
	 * @param accountNumber n�mero de la cuenta.
	 */	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/*
	 * M�todo get que devuelve el numero de la cuenta bancaria.
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	
	/*
	 * M�todo Set que permite asignar el nombre del propietario a la cuenta bancaria.
	 * @param accountOwner indica el nombre del propietario de la cuenta bancaria.
	 */	
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	
	/*
	 * M�todo get que devuelve el nombre del propietario de la cuenta bancaria.
	 */
	public String getAccountOwner() {
		return accountOwner;
	}
	
	/*
	 * M�todo para depositar en la cuenta bancaria
	 * @param value: valor a depositar
	 */
	public void deposit (float value) {
		accountBalance = accountBalance + value; 
	}
	
	/*
	 * M�todo para retirar de la cuenta bancaria
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
	 * M�todo para consultar el saldo de la cuenta bancaria
	 */	
	public float getAccountBalance() {
		return accountBalance;
	}

}
