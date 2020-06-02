package com.pao.examen.part2;

import java.util.Objects;

public class Automobil {

	private String marca;

	private String model;

	private int capacitate;

	private double pret;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacitate() {
		return capacitate;
	}

	public void setCapacitate(int capacitate) {
		this.capacitate = capacitate;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Automobil automobil = (Automobil) o;
		return Objects.equals(marca, automobil.marca);
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca);
	}

	@Override
	public String toString() {
		return "Automobil{" +
				"marca='" + marca + '\'' +
				", model='" + model + '\'' +
				", capacitate=" + capacitate +
				", pret=" + pret +
				'}';
	}
}
