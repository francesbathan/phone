package com.phone.main;

public interface Ringable {
	
	default String ring() {
		return "Ring!!!";
	}
	
	default String unlock() {
		return "Unlocking via swipe.";
	}
}
