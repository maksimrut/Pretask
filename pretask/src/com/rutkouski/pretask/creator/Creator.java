package com.rutkouski.pretask.creator;

import com.rutkouski.pretask.entity.CustomNumber;

public class Creator {
	
	public CustomNumber createCustomNumber(double number) {
		
		return new CustomNumber(number);
	}
}
