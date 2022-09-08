package jsonToPojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Address;

public class AddressPojoObjectToJsonPayload {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		Address address = new Address();
		address.setQno(0);
		address.setStreet(13);
		address.setSector("9B");
		address.setZip(827009);
		address.setCity(null);
		
		ObjectMapper objmapper = new ObjectMapper();
		String jsonPayload = objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		System.out.println(jsonPayload);

	}

}
