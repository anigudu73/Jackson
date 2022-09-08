package jsonToPojo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.common.mapper.TypeRef;
import io.restassured.path.json.JsonPath;
import pojo.Address2;

public class Address2Deserialization {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper objmapper = new ObjectMapper();
		ArrayList<Address2> addresses = objmapper.readValue(new File("C:\\Eclipse\\Selenium\\Jackson\\src\\test\\resources\\Payload\\Address2.json"), new TypeReference<ArrayList<Address2>>(){});
		
		System.out.println(addresses.get(0).isPermanent());
		System.out.println(addresses.get(1).isPermanent());
		
		JsonPath jsonpath = new JsonPath(new File("C:\\Eclipse\\Selenium\\Jackson\\src\\test\\resources\\Payload\\Address2.json"));
		
		
		
		Address2 address = jsonpath.getObject("[0]", Address2.class);
		
		System.out.println(address.getCity());
		
		LinkedHashMap address2 = jsonpath.getObject("[1]", new TypeRef<LinkedHashMap<String,Object>>(){});
		
		System.out.println(address2.keySet());
		
		
		
		
		
		
		
		
		

	}

}
