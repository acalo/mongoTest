package com.openjaw.mongoTest.view;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.BulkUpdateRequestBuilder;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteRequestBuilder;
import com.mongodb.BulkWriteResult;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;
import com.mongodb.util.JSON;
import com.openjaw.mongoTest.context.Context;
import com.openjaw.mongoTest.domain.PersonData;
import com.openjaw.mongoTest.tools.Constants;
import com.openjaw.mongoTest.tools.Tools;

public class BulkInsertMongodb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = Context.getInstance();
		
		MongoClient client = context.getMongo();
		BulkWriteResult result = null;
		
		DB bbdd = client.getDB(context.getProperties().getProperty(Constants.mongo_db));
		DBCollection coll = bbdd.getCollection(context.getProperties().getProperty(Constants.mongo_col));
		
		BulkWriteOperation bulk = coll.initializeOrderedBulkOperation();
		
		ObjectMapper mapper = new ObjectMapper();
		String type = args[0];
		if ("I".equals(type)){
			// Ejemplo de Bulk Insert
			try{
				for (int i=0;i<1000;i++){
					PersonData person = new PersonData("username_"+i, "name_"+i, "lastName_"+i, i, "gender_"+i);
					String json = mapper.writeValueAsString(person);
					DBObject dbObject = (DBObject)JSON.parse(json);
					bulk.insert(dbObject);
				}
				result = bulk.execute(WriteConcern.SAFE);
				
			}catch (Exception e){
				System.out.println("Error Update: "+Tools.stackTrace(e));
			}
		}
		
		if ("U".equals(type)){
			// Ejemplo de Bulk Upsert
			try{
				for (int i=0;i<100;i++)
				{
					BulkWriteRequestBuilder bulkWriteRequestBuilder=bulk.find(new BasicDBObject("name","name_"+i));
					BulkUpdateRequestBuilder updateReq=   bulkWriteRequestBuilder.upsert();
					PersonData person = new PersonData("username_"+i,"name_"+i, "lastName_"+i, i, "gender_"+i);
					String json = mapper.writeValueAsString(person);
					DBObject dbObject = (DBObject)JSON.parse(json);
					updateReq.replaceOne (dbObject);
				}
				result=bulk.execute();
			}catch (Exception e){
				System.out.println("Error Upsert: "+Tools.stackTrace(e));
			}	
		}
		if (result!=null){
			System.out.println(""+result.getInsertedCount());
			System.out.println(""+result.getMatchedCount());
			System.out.println(""+result.getModifiedCount());
			System.out.println(""+result.getRemovedCount());
		}
		
	}

}
