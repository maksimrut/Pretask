package com.rutkouski.pretask.parser.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rutkouski.pretask.exception.ParserException;
import com.rutkouski.pretask.parser.StringToDoubleParser;
import com.rutkouski.pretask.validator.StringLineValidator;

public class StringToDoubleParserImpl implements StringToDoubleParser {
	
	static Logger logger = LogManager.getLogger();

	@Override
	public List<Double> parseToDouble(List<String> listString) throws ParserException {

		StringLineValidator stringLineValidator = new StringLineValidator();
		List<Double> listDouble = new ArrayList<>();

		if (!listString.isEmpty()) {

			for (String line : listString) {

				if (stringLineValidator.validate(line)) {
					listDouble.add(Double.parseDouble(line));

				} else {
					logger.error("Failed validation");
					throw new ParserException("Failed validation");
				}
			}
		} 
		return listDouble;
	}
}
