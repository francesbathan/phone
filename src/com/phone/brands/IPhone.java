package com.phone.brands;
import com.phone.main.Phone;
import com.phone.main.Ringable;

public class IPhone extends Phone implements Ringable {
	
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		return getRingTone();
	}
	
	@Override
	public String unlock() {
		return "Unlocking via facial recognition";
		
	}
	
	@Override
	public void displayInfo() {
		System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier());
	}
}
