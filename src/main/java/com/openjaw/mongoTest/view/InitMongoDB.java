package com.openjaw.mongoTest.view;

import com.openjaw.mongoTest.DAO.TestingDB;
import com.openjaw.mongoTest.DAO.TestingMongoDB;
import com.openjaw.mongoTest.tools.Tools;

public class InitMongoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingDB test = new TestingMongoDB();
		try{
			test.initMongoDBTest();
		}catch (Exception e){
			System.out.println("Error: "+Tools.stackTrace(e));
		}
	}

}
