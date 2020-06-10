package muk.spring.mvc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import muk.spring.mvc.beans.Address;

public class AddressFormatter implements Formatter<Address> {

	public String print(Address arg0, Locale arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Address parse(String arg0, Locale arg1) throws ParseException {
		String arr[]=arg0.split(" ");
		Address address=new Address();
		address.setCity(arr[0]);
		address.setZipcode(arr.length==2?arr[1]:"NA");
		return address;
	}

}
