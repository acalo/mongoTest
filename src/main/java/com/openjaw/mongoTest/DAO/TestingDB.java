package com.openjaw.mongoTest.DAO;

import com.openjaw.mongoTest.domain.QueryData;
import com.openjaw.mongoTest.domain.ServicesData;

public interface TestingDB {
	public void initMongoDBTest() throws Exception;
	public void initHotelSearch() throws Exception;
	public ServicesData find(QueryData query);
}
