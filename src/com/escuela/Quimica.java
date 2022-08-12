package com.escuela;

public class Quimica extends Test {

	public Quimica(Values valor) {
		super(valor);
	}

	@Override
	public Values getCalificacion() {
		return valor;
	}

}
