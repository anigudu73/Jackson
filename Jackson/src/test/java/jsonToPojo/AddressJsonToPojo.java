package jsonToPojo;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Address;

public class AddressJsonToPojo {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException
	{
		ObjectMapper objectmapper = new ObjectMapper();
		
		Address address = objectmapper.readValue(new File("C:\\Eclipse\\Selenium\\Jackson\\src\\test\\resources\\Payload\\Address.json"), Address.class);

		System.out.println(address.getCity());

		address.setCity("Bhopal");

		System.out.println(address.getCity());


		//Experimentation

		LinkedHashMap<String,Object> addressmap = objectmapper.readValue(new File("C:\\Eclipse\\Selenium\\Jackson\\src\\test\\resources\\Payload\\Address.json"), LinkedHashMap.class);

		Iterator<String> itr = addressmap.keySet().iterator();

		while(itr.hasNext())
			System.out.println(itr.next());

		Iterator<Entry<String,Object>> itr2 = addressmap.entrySet().iterator();

		while(itr2.hasNext())
			System.out.println(itr2.next().getValue());

		addressmap = objectmapper.readValue(new File("C:\\Eclipse\\Selenium\\Jackson\\src\\test\\resources\\Payload\\Address.json"), new TypeReference<LinkedHashMap<String,Object>>(){});

		System.out.println(addressmap.keySet());

		addressmap.put("state", "jharkhand");

		System.out.println(addressmap.keySet());







	}

}
