package com.rutkouski.pretask.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rutkouski.pretask.entity.CustomNumber;
import com.rutkouski.pretask.service.NumberService;

public class NumberServiceImpl implements NumberService {
	
	static Logger logger = LogManager.getLogger();
	
	@Override
	public CustomNumber sum(CustomNumber number1, CustomNumber number2) {
		
		double sum = number1.getNumber() + number2.getNumber();
		logger.info("The sum is: " + sum);
		return new CustomNumber(sum);
	}

	@Override
	public CustomNumber subtracte(CustomNumber minuend, CustomNumber subtrahend) {
		
		double subtraction = minuend.getNumber() - subtrahend.getNumber();
		logger.info("The subtraction is: " + subtraction);
		return new CustomNumber(subtraction);
	}

	@Override
	public CustomNumber myltiply(CustomNumber number1, CustomNumber number2) {
		
		double myltiplication = number1.getNumber() * number2.getNumber();
		logger.info("The myltiplication is: " + myltiplication);
		return new CustomNumber(myltiplication);
	}

	@Override
	public CustomNumber divide(CustomNumber dividend, CustomNumber divisor) {
		
		double division = dividend.getNumber() / divisor.getNumber();
		logger.info("The division is: " + division);
		return new CustomNumber(division);
	}
}
