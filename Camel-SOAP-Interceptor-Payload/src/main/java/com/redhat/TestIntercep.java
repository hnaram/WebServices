package com.redhat;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class TestIntercep extends AbstractSoapInterceptor{

	public TestIntercep() {
		super(Phase.INVOKE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMessage(SoapMessage msg) throws Fault {
		// TODO Auto-generated method stub
		System.out.println("======> TestInterceptor  <=======");	
		
	}

}
