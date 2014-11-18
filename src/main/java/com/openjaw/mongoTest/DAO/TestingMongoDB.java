package com.openjaw.mongoTest.DAO;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.BulkUpdateRequestBuilder;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteRequestBuilder;
import com.mongodb.BulkWriteResult;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;
import com.openjaw.mongoTest.context.Context;
import com.openjaw.mongoTest.domain.FlightData;
import com.openjaw.mongoTest.domain.FlightsData;
import com.openjaw.mongoTest.domain.HotelData;
import com.openjaw.mongoTest.domain.HotelsData;
import com.openjaw.mongoTest.domain.PersonData;
import com.openjaw.mongoTest.domain.QueryData;
import com.openjaw.mongoTest.domain.ServicesData;
import com.openjaw.mongoTest.tools.Constants;
import com.openjaw.mongoTest.tools.Tools;

public class TestingMongoDB implements TestingDB{
	public void initMongoDBTest() throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		String xml = Tools.generateRandomXML();
		
		System.out.println("XML : "+xml);
		
		ServicesData services = (ServicesData)Tools.XMLtoObject(ServicesData.class, xml);
		//String json = Tools.transformXSLT("xmlToJson.xsl", xml);
		
		//System.out.println("JSON : "+json);
		
		int flightsCount = 0;
		int hotelsCount = 0;
		Context context = Context.getInstance();
		
		MongoClient client = context.getMongo();
		BulkWriteResult result = null;
		
		DB bbdd = client.getDB(context.getProperties().getProperty(Constants.mongo_db));
		DBCollection coll = bbdd.getCollection(context.getProperties().getProperty(Constants.mongo_col));
		BulkWriteOperation bulk = coll.initializeOrderedBulkOperation();
		
		if (services.getFlights()!=null && services.getFlights().getFlights()!=null && services.getFlights().getFlights().size()>0){
			for (FlightData flight: services.getFlights().getFlights()){
				String json = mapper.writeValueAsString(flight);
				DBObject dbObject = (DBObject)JSON.parse(json);
				bulk.insert(dbObject);
				flightsCount++;
			}
		}
		
		if (services.getHotels()!=null && services.getHotels().getHotels()!=null && services.getHotels().getHotels().size()>0){
			for (HotelData hotel: services.getHotels().getHotels()){
				String json = mapper.writeValueAsString(hotel);
				DBObject dbObject = (DBObject)JSON.parse(json);
				bulk.insert(dbObject);
				hotelsCount++;
			}
		}
		
		result = bulk.execute();
		
		if (result!=null){
			System.out.println("Flights Count : "+flightsCount);
			System.out.println("Hotels Count : "+hotelsCount);
			System.out.println("Total Inserting : "+(flightsCount+hotelsCount));
			
			System.out.println("getInsertedCount-->"+result.getInsertedCount());
			System.out.println("getMatchedCount-->"+result.getMatchedCount());
			System.out.println("getModifiedCount-->"+result.getModifiedCount());
			System.out.println("getRemovedCount-->"+result.getRemovedCount());
		}
	}
	
	public void initHotelSearch() throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		String json = Tools.generateRandomHotelsJSON();
		
		System.out.println("XML : "+xml);
		
		ServicesData services = (ServicesData)Tools.XMLtoObject(ServicesData.class, xml);
		//String json = Tools.transformXSLT("xmlToJson.xsl", xml);
		
		//System.out.println("JSON : "+json);
		
		int flightsCount = 0;
		int hotelsCount = 0;
		Context context = Context.getInstance();
		
		MongoClient client = context.getMongo();
		BulkWriteResult result = null;
		
		DB bbdd = client.getDB(context.getProperties().getProperty(Constants.mongo_db));
		DBCollection coll = bbdd.getCollection(context.getProperties().getProperty(Constants.mongo_col));
		BulkWriteOperation bulk = coll.initializeOrderedBulkOperation();
		
		if (services.getFlights()!=null && services.getFlights().getFlights()!=null && services.getFlights().getFlights().size()>0){
			for (FlightData flight: services.getFlights().getFlights()){
				String json = mapper.writeValueAsString(flight);
				DBObject dbObject = (DBObject)JSON.parse(json);
				bulk.insert(dbObject);
				flightsCount++;
			}
		}
		
		if (services.getHotels()!=null && services.getHotels().getHotels()!=null && services.getHotels().getHotels().size()>0){
			for (HotelData hotel: services.getHotels().getHotels()){
				String json = mapper.writeValueAsString(hotel);
				DBObject dbObject = (DBObject)JSON.parse(json);
				bulk.insert(dbObject);
				hotelsCount++;
			}
		}
		
		result = bulk.execute();
		
		if (result!=null){
			System.out.println("Flights Count : "+flightsCount);
			System.out.println("Hotels Count : "+hotelsCount);
			System.out.println("Total Inserting : "+(flightsCount+hotelsCount));
			
			System.out.println("getInsertedCount-->"+result.getInsertedCount());
			System.out.println("getMatchedCount-->"+result.getMatchedCount());
			System.out.println("getModifiedCount-->"+result.getModifiedCount());
			System.out.println("getRemovedCount-->"+result.getRemovedCount());
		}
	}
	
	public ServicesData find(QueryData query){
		Context context = Context.getInstance();
		DBCursor cursor = null;
		MongoClient client = context.getMongo();
		BulkWriteResult result = null;
		ObjectMapper mapper = new ObjectMapper();
		ServicesData services = new ServicesData();
		HotelsData hts = new HotelsData();
		FlightsData fls = new FlightsData();
		List<FlightData> fArray = new ArrayList<FlightData>();
		List<HotelData> hArray = new ArrayList<HotelData>();
		try{
			DB bbdd = client.getDB(context.getProperties().getProperty(Constants.mongo_db));
			DBCollection coll = bbdd.getCollection(context.getProperties().getProperty(Constants.mongo_col));
			
			cursor = coll.find();
			
			while (cursor.hasNext()){
				DBObject obj = cursor.next();
				Object type = obj.get("type");
				if ("A".equals(type)){
					hArray.add(mapper.readValue(obj.toString(),HotelData.class));
				}else if ("V".equals(type)){
					fArray.add(mapper.readValue(obj.toString(),FlightData.class));
				}
				System.out.println(obj.toString());
				
			}
			hts.setHotels(hArray);
			fls.setFlights(fArray);
			services.setFlights(fls);
			services.setHotels(hts);
		}catch (Exception e){
			System.out.println("Error: "+Tools.stackTrace(e));
		}finally{
			if (cursor!=null){
				cursor.close();
			}
		}
		return services;
	}
}
