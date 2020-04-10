package com.phone.main;

public abstract class Phone {
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	
	public String getVersionNumber() {
		return versionNumber;
	}
	
	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public String getCarrier() {
		return carrier;
	}

	public String getRingTone() {
		return ringTone;
	}
	
	public abstract void displayInfo();

}
