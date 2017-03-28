package xmlDemo;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//obtain and configure a SAX based Parser
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//obtain object for SAXParser
			SAXParser saxParser = null;
			try {
				saxParser = factory.newSAXParser();
			} catch (ParserConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SAXException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		/*
		 * default handler for SAX handler class
		 * all three methods are written in handler's body 
		 */
		DefaultHandler handler = new DefaultHandler(){
			boolean bname = false;
			boolean bprice = false;
			boolean bdescription = false;
			boolean bcalories = false;
			
			//this method is called everytime the perser gets an open tag '<'
			//identifies which tag is being open at time by assigning an open flag
			
			public void startElement(String url, String localname, String qName, Attributes attributes) throws SAXException{
				if(qName.equalsIgnoreCase("name")){
					bname = true;
				}
				if(qName.equalsIgnoreCase("price")){
					bprice = true;
				}
				if(qName.equalsIgnoreCase("description")){
					bdescription = true;
				}
				if(qName.equalsIgnoreCase("calories")){
					bcalories = true;
				}
			}
			
			public void endElement(String url, String localname, String qName) throws SAXException{
				
			}
			//print data stored in between '<' and '>' tags
			
			public void characters(char ch[], int start, int length)throws SAXException{
				if(bname){
					System.out.println("name: "+new String(ch, start, length));
					bname= false;
				}
				if(bprice){
					System.out.println("price: "+new String(ch, start, length));
					bprice= false;
				}
				if(bdescription){
					System.out.println("description: "+new String(ch, start, length));
					bdescription= false;
				}
				if(bcalories){
					System.out.println("name: "+new String(ch, start, length));
					bcalories = false;
				}
			}
		};
		try {
			saxParser.parse("sample.xml", handler);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
