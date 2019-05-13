package com.gqm.RestPrueba.test;

import java.io.IOException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Test {
	
	public static void main(String arg0 []) throws IOException{
		XmlMapper xmlMapper = new XmlMapper();
	    SimpleBean value
	      = xmlMapper.readValue("<SimpleBean><x>1</x><y>2</y></SimpleBean>", SimpleBean.class);
	}

}
