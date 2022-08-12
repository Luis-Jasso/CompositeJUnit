package com.escuela;

public class Historia extends Test {

	public Historia(Values valor) {
		super(valor);
	}

	@Override
	public Values getCalificacion() {
		return valor;
	}

}
