package com.rutkouski.pretask.validator;

public class StringLineValidator {
	
	private static final String DOUBLE_NUMBER_PATTERN = "-?\\d*\\.?\\d*";
	
	public final boolean validate(String line) {
		
		return line != null? line.matches(DOUBLE_NUMBER_PATTERN) : false;
	}
}
