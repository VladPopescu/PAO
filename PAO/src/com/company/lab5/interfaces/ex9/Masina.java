package com.company.lab5.interfaces.ex9;

public class Masina implements Vehicul, Alarm{

	@Override
	public void setAlartm() {

	}

	@Override
	public String turnAlarmOn() {
		return Vehicul.super.turnAlarmOn();
	}

	@Override
	public String turnAlarmOff() {
		return Alarm.super.turnAlarmOff();
	}


}
