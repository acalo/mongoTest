package com.openjaw.mongoTest.context;

import java.io.InputStream;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.openjaw.mongoTest.tools.Constants;

public class Context {
	private static Context instance;
	
	private MongoClient mongo;
	private Properties properties;
		
	public MongoClient getMongo() {
		return mongo;
	}

	public void setMongo(MongoClient mongo) {
		this.mongo = mongo;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public static Context getInstance(){
		if (instance==null){
			instance = new Context();
		}
		return instance;
	}
	
	public Context(){
		init();
	}
	
	public void destroy(){
		if (mongo!=null){
			mongo.close();
		}
		this.properties = null;
	}
	
	private void init(){
		initProp();
		initMongoDB();
	}
	
	private void initProp(){
		try{
			InputStream prop = getClass().getClassLoader().getResourceAsStream(Constants.name_prop);
			this.properties = new Properties();
			this.properties.load(prop);
		}catch (Exception e){
			//logger.error("Context-->initProp-->"+Tools.stackTrace(e));
		}
		
	}
	
	private void initMongoDB(){
		try{
			//logger.info("Init initMongoDB");
			
			
			/*String host = System.getenv("OPENSHIFT_MONGODB_DB_HOST");
	        String sport = System.getenv("OPENSHIFT_MONGODB_DB_PORT");
	        String db = System.getenv("OPENSHIFT_APP_NAME");
	        if(db == null)
	            db = "struts";
	        String user = System.getenv("OPENSHIFT_MONGODB_DB_USERNAME");
	        String password = System.getenv("OPENSHIFT_MONGODB_DB_PASSWORD");
	        int port = Integer.decode(sport);*/
			
	        //logger.error("CREDENCIALES: "+user+" - "+password+" - "+db);
	        //logger.error("ServerAdress: "+host+" - "+port);
			//MongoCredential credential = MongoCredential.createCredential(user, db, password.toCharArray());
			
			String host = getProperties().getProperty(Constants.mongo_host);
			Integer port = Integer.valueOf(getProperties().getProperty(Constants.mongo_port));
			
			ServerAddress server = new ServerAddress(host,port);
			MongoClientOptions options = null;
			mongo = new MongoClient(server);
			//logger.info("Init initMongoDB");
		}catch (Exception e){
			//logger.error("Context-->initMongoDB-->"+Tools.stackTrace(e));
		}
	}
}
