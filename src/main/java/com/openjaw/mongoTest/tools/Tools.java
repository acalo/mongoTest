package com.openjaw.mongoTest.tools;

import java.io.PrintWriter;
import java.io.StringWriter;


public class Tools {
	public static String stackTrace(Throwable t){
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);
		return sw.toString();
	}
}
