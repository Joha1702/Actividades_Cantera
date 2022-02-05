package Clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date date = format.parse("11-05-1997");
		
		Person leidy = new Person();
		leidy.setDateBirth(date);
		
		System.out.println("Leidy tiene "+leidy.getAge()+" años");

	}

}
