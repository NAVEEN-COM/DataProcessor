package com.jsp.DataProcessor.Controller;
import trialDemo.StringConvertor;
public class DataHandler {
	
	
	public static void main(String[] args) {
		String data = "hello   World";
		StringConvertor convertor = new StringConvertor();
		System.out.println(convertor.stringReverse(data));
		System.out.println(convertor.uppercaseConvertor(data));
	}
}