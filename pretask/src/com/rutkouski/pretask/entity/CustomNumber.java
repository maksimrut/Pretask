package com.rutkouski.pretask.entity;

import java.util.Objects;

public class CustomNumber {
	
	private double number;

	public CustomNumber() {
	}

	public CustomNumber(double number) {
		this.number = number;
	}
	
	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		CustomNumber other = (CustomNumber) obj;
		return Double.doubleToLongBits(number) == Double.doubleToLongBits(other.number);
	}

	@Override
	public String toString() {
		return "CustomNumber [customNumber=" + number + "]";
	}
}
