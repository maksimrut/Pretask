package com.rutkouski.pretask.parser;

import java.util.ArrayList;
import java.util.List;

import com.rutkouski.pretask.exception.ParserException;

public interface StringToDoubleParser {
	
	List<Double> parseToDouble(List<String> listString) throws ParserException;
}
