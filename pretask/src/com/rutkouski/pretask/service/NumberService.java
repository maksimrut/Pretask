package com.rutkouski.pretask.service;

import com.rutkouski.pretask.entity.CustomNumber;

public interface NumberService {
	
	public CustomNumber sum(CustomNumber number1, CustomNumber number2);
	
	public CustomNumber subtracte(CustomNumber minuend, CustomNumber subtrahend);
	
	public CustomNumber myltiply(CustomNumber number1, CustomNumber number2);
	
	public CustomNumber divide(CustomNumber dividend, CustomNumber divisor);
}
