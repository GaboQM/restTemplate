package com.gqm.RestPrueba.test;

import java.io.IOException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class StringToObject {
	public static void main(String arg0 []) {
		   XmlMapper xmlMapper = new XmlMapper();
		   
		   try {
			Properties propieties =xmlMapper.readValue("<Properties>" + 
			   		"<urlWSCU>http://10.02.12.23:8080/WSCU/cuentaDigital/cliente</urlWSCU>" + 
			   		"</Properties>",Properties.class);
			
		System.out.println(propieties.getUrlWSCU());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
