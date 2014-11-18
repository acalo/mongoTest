package com.openjaw.mongoTest.tools;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import com.openjaw.mongoTest.domain.FlightData;
import com.openjaw.mongoTest.domain.FlightsData;
import com.openjaw.mongoTest.domain.HotelData;
import com.openjaw.mongoTest.domain.HotelsData;
import com.openjaw.mongoTest.domain.ServicesData;
import com.openjaw.mongoTest.domain.openjaw.HotelSearchResults;
import com.openjaw.mongoTest.domain.openjaw.POS;
import com.openjaw.mongoTest.domain.openjaw.PageInfo;


public class Tools {
	private static final String DATEFORMAT = "dd/MM/yyyy";
	private static TransformerFactory tFactory = TransformerFactory.newInstance();  
	
	public static String stackTrace(Throwable t){
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);
		return sw.toString();
	}
	public static Calendar offsetCurrentDate(int i) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, i);
		return calendar;
	}

	public static String formatDate(Date date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(DATEFORMAT);
			return sdf.format(date);
		} catch (Exception ex) {
			return "";
		}
	}
	
	public static String generateRandomXML(){
		ServicesData services = new ServicesData();
		List<HotelData> hotels = new ArrayList<HotelData>();
		List<FlightData> flights = new ArrayList<FlightData>();
		StringBuilder build = new StringBuilder();
		Random r = new Random();
		
		int servicios = 10;
		String[] typeArray = {"A","V"};
		
		Integer[] poblationReturnArray = {6396,7257,6430,4984};
		Integer[] poblationOutboundArray = {2674,4512,9966,8255};
		String[] companyArray = {"C1","C2","C3"};
		String[] hotelArray = {"H1","H2","H3","H4","H5"};
		int numOffsetDate = 11;
		int[] offsetDates = {30, 60, 120, 150, 180, 30, 60, 30, 120, 150, 30};
		build.append("<services>");
		for (int i=0;i<servicios;i++){
			int offsetDate = (int) (Math.random() * offsetDates[(int) (Math.random() * numOffsetDate)] + 1);
			int numNights = (int) (Math.random() * 7 + 1);
			String dateIn = Tools.formatDate(Tools.offsetCurrentDate(offsetDate).getTime());
			String dateOut = Tools.formatDate(Tools.offsetCurrentDate(offsetDate + numNights).getTime());
			// Poblation
			Integer poblationReturn = poblationReturnArray[r.nextInt(4)];
			Integer poblationOutbound = poblationOutboundArray[r.nextInt(4)];
			// Price
			Integer price = r.nextInt(300);
			
			// type
			String type = typeArray[r.nextInt(2)];
			
			build.append("<flight>");
			String company = companyArray[r.nextInt(3)];
			FlightData flightOutbound = new FlightData(price, type, company, dateIn,"O",poblationOutbound,poblationReturn);
			generateFlight(build, flightOutbound);
			build.append("</flight>");
			flights.add(flightOutbound);
			build.append("<flight>");
			company = companyArray[r.nextInt(3)];
			FlightData flightReturn = new FlightData(price, type, company, dateOut,"R",poblationReturn,poblationOutbound);
			generateFlight(build, flightReturn);
			flights.add(flightReturn);
			build.append("</flight>");
		
			build.append("<hotel>");
			String hotel = hotelArray[r.nextInt(5)];
			HotelData hotelData = new HotelData(price, type, hotel, dateIn, dateOut,poblationReturn);
			generateHotel(build, hotelData);
			hotels.add(hotelData);
			build.append("</hotel>");
		}
		build.append("</services>");
		FlightsData fls = new FlightsData();
		fls.setFlights(flights);
		HotelsData hts = new HotelsData();
		hts.setHotels(hotels);
		services.setFlights(fls);
		services.setHotels(hts);
		
		String xml = ObjecttoXML(ServicesData.class, services);
		
		return xml;
	}
	
	public static String generateRandomHotelsJSON(){
		HotelSearchResults hotelSearch = new HotelSearchResults();
		Random r = new Random();
		
		int servicios = 10;
		String[] typeArray = {"A","V"};
		
		Integer[] poblationReturnArray = {6396,7257,6430,4984};
		Integer[] poblationOutboundArray = {2674,4512,9966,8255};
		String[] companyArray = {"C1","C2","C3"};
		String[] hotelArray = {"H1","H2","H3","H4","H5"};
		int numOffsetDate = 11;
		int[] offsetDates = {30, 60, 120, 150, 180, 30, 60, 30, 120, 150, 30};
		
		PageInfo pinfo = new PageInfo();
		pinfo.setConversationID("conversationID");
		pinfo.setFromServicing(true);
		pinfo.setLanguage("language");
		pinfo.setLocale("locale");
		POS pos = new POS();
		pos.setCompanyCode("companyCode");
		pinfo.setPOS(pos);
		pinfo.setReadOnly(true);
		pinfo.setSessionID("sessionID");
		pinfo.setSessionSource("sessionSource");
		pinfo.setSkin("skin");
		
		for (int i=0;i<servicios;i++){
			int offsetDate = (int) (Math.random() * offsetDates[(int) (Math.random() * numOffsetDate)] + 1);
			int numNights = (int) (Math.random() * 7 + 1);
			String dateIn = Tools.formatDate(Tools.offsetCurrentDate(offsetDate).getTime());
			String dateOut = Tools.formatDate(Tools.offsetCurrentDate(offsetDate + numNights).getTime());
			// Poblation
			Integer poblationReturn = poblationReturnArray[r.nextInt(4)];
			Integer poblationOutbound = poblationOutboundArray[r.nextInt(4)];
			// Price
			Integer price = r.nextInt(300);
			
			// type
			String type = typeArray[r.nextInt(2)];
			
			
		}
		
		
		String xml = ObjecttoXML(ServicesData.class, services);
		
		return xml;
	}
	
	public static void generateFlight(StringBuilder builder, FlightData flight){
		builder.append("<company>").append(flight.getCompany()).append("</company>");
		builder.append("<date>").append(flight.getDate()).append("</date>");
		builder.append("<typeflight>").append(flight.getTypeFlight()).append("</typeflight>");
		builder.append("<poblationOut>").append(flight.getPoblationOut()).append("</poblationOut>");
		builder.append("<poblationReturn>").append(flight.getPoblationReturn()).append("</poblationReturn>");
		builder.append("<type>").append(flight.getType()).append("</type>");
		builder.append("<price>").append(flight.getPrice()).append("</price>");
	}
	
	public static void generateHotel(StringBuilder builder, HotelData hotel){
		builder.append("<idhotel>").append(hotel.getHotel()).append("</idhotel>");
		builder.append("<dateIn>").append(hotel.getDateIn()).append("</dateIn>");
		builder.append("<dateOut>").append(hotel.getDateOut()).append("</dateOut>");
		builder.append("<poblation>").append(hotel.getPoblation()).append("</poblation>");
		builder.append("<type>").append(hotel.getType()).append("</type>");
		builder.append("<price>").append(hotel.getPrice()).append("</price>");
		
	}
	
	public static String transformXSLT(String xsltFile, String xml){
		InputStream streamIn = new ByteArrayInputStream(xml.getBytes());
		ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
		try{
			try {
				Transformer transformer =  
						tFactory.newTransformer(new StreamSource(Tools.class.getResourceAsStream("/resources/"+xsltFile)));  
			
				transformer.transform(new StreamSource(streamIn),  
						new StreamResult(streamOut));  
			} catch (Exception e) {  
			e.printStackTrace();  
			} 
			if (streamIn!=null){
				streamIn.close();
			}
			if (streamOut!=null){
				streamOut.close();
			}
		}catch (Exception e){
			System.out.println("Error xslt: "+Tools.stackTrace(e));
		}
		return new String(streamOut.toByteArray());
	}
	
	public static String ObjecttoXML(Class classname, Object obj){
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try{
			
			JAXBContext jaxbContext = JAXBContext.newInstance(classname);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 
			jaxbMarshaller.marshal(obj, out);
			
			if (out!=null){
				out.close();
			}
			
			
		}catch (Exception e){
			System.out.println("Error : "+Tools.stackTrace(e));
		}
		return new String(out.toByteArray());
	}
	
	public static Object XMLtoObject(Class classname, String xml){
		Object obj = null;
		try{
			JAXBContext jaxbContext = JAXBContext.newInstance(classname);
			 
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			obj = (Object) jaxbUnmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes()));
		}catch (Exception e){
			System.out.println("Error : "+Tools.stackTrace(e));
		}
		return obj;
	}
}
