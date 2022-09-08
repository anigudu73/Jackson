package jsonToPojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Address2;

public class Address2Serialization {
	
	public static void main(String[] args) throws JsonProcessingException
	{
		Address2 address = new Address2();
		
		address.setCity("Bokaro");
		address.setPermanent(true);
		address.setQno(0);
		address.setSector("9B");
		address.setStreet(13);
		address.setZip(827009);
		
		ObjectMapper objmapper = new ObjectMapper();
		String payload = objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		
		System.out.println(payload);
	}

}
