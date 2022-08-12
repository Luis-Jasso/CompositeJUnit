package com.escuela;

public class Leaf implements Examen {
	
	
	private Values value;
	
	public Leaf(Values value) {
		super();
		this.value = value;
	}


	@Override
	public Values getCalificacion() {
		return value;
	}

}
