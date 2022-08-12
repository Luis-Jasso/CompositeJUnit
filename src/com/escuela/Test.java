package com.escuela;

public abstract class Test implements Examen {

	Values valor;

	public Test(Values valor) {
		this.valor = valor;
	}
	
	@Override
	public Values getCalificacion() {
		// TODO Auto-generated method stub
		return valor;
	}
	

}
