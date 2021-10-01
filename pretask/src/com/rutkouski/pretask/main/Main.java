package com.rutkouski.pretask.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rutkouski.pretask.creator.Creator;
import com.rutkouski.pretask.entity.CustomNumber;
import com.rutkouski.pretask.exception.ParserException;
import com.rutkouski.pretask.exception.ReaderException;
import com.rutkouski.pretask.parser.impl.StringToDoubleParserImpl;
import com.rutkouski.pretask.reader.impl.LineFileReaderImpl;
import com.rutkouski.pretask.service.impl.NumberServiceImpl;

public class Main {
	
	static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		
		String filePath = "files\\file.txt";
		
		LineFileReaderImpl lineFileReaderImpl = new LineFileReaderImpl();
		StringToDoubleParserImpl stringToDoubleParserImpl = new StringToDoubleParserImpl();
		Creator creator1 = new Creator();
		Creator creator2 = new Creator();
		NumberServiceImpl numberServiceImpl = new NumberServiceImpl();
		
		
		try {
			List<String> listLines = lineFileReaderImpl.readFileLines(filePath);
			List<Double> listdouble = stringToDoubleParserImpl.parseToDouble(listLines);
			CustomNumber customNumber1 = creator1.createCustomNumber(listdouble.get(0));
			CustomNumber customNumber2 = creator2.createCustomNumber(listdouble.get(1));
			
			numberServiceImpl.sum(customNumber1, customNumber2);
			numberServiceImpl.subtracte(customNumber1, customNumber2);
			numberServiceImpl.myltiply(customNumber1, customNumber2);
			numberServiceImpl.divide(customNumber1, customNumber2);
			
		} catch (ReaderException e) {
			logger.error("ReaderException", e);
		} catch (ParserException e) {
			logger.error("ParserException", e);
		} 
	}
}
