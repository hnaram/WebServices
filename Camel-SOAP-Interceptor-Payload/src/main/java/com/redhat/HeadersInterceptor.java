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

public class HeadersInterceptor extends AbstractSoapInterceptor{

	public HeadersInterceptor() {
		super(Phase.POST_LOGICAL);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMessage(SoapMessage msg) throws Fault {
		// TODO Auto-generated method stub
		System.out.println("======> INICIANDO INTERCEPTOR <=======");	
		
		/*INICIA LA CREACION DE SESSION HEADER*/
		DocumentBuilder builder = null;
		try {
			builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		Document doc = builder.newDocument();

		Element eSession = doc.createElement("Session");

		Element eSessionId = doc.createElement("SessionId");
		eSessionId.setTextContent("0112KMFZB1");

		Element eSequence = doc.createElement("SequenceNumber");
		eSequence.setTextContent("1");

		Element eToken = doc.createElement("SecurityToken");
		eToken.setTextContent("1L5T3R28SX89Q11UGIISG9DGBG");
		
		eSession.appendChild(eSessionId);
		eSession.appendChild(eSequence);
		eSession.appendChild(eToken);
		
		// Create Header object
		QName qnameCredentials = new QName("Secured");
		Header header = new Header(qnameCredentials,
				eSession);
		msg.getHeaders().add(header);
		/*FINALIZA LA CREACION DE SESSION HEADER*/
	}

}
