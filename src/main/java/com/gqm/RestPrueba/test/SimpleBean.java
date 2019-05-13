package com.gqm.RestPrueba.test;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SimpleBean {

	  @JacksonXmlProperty(localName = "x")
	private int x = 1;
	  @JacksonXmlProperty(localName = "y")
    private int y = 2;
}
