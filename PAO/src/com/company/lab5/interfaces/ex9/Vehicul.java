package com.company.lab5.interfaces.ex9;

public interface Vehicul {
	default String turnAlarmOn() {
		return "Turning the vehicle alarm on.";
	}

	default String turnAlarmOff() {
		return "Turning the vehicle alarm off.";
	}
}
