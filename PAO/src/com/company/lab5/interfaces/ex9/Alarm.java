package com.company.lab5.interfaces.ex9;

public interface Alarm {

	void setAlartm();

	default String turnAlarmOn() {
		return "Turning the alarm on.";
	}

	default String turnAlarmOff() {
		return "Turning the alarm off.";
	}

	static int getHorsePower(int rpm, int torque) {
		return (rpm * torque) / 5252;
	}

}
