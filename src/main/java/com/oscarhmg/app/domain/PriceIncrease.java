package com.oscarhmg.app.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class PriceIncrease {
	
	
	@Min(0)
	@Max(50)
	private int percentage;

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	
	

}
