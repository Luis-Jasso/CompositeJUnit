package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.escuela.Examen;
import com.escuela.Fisica;
import com.escuela.Historia;
import com.escuela.Matematicas;
import com.escuela.MecanicaCuantica;
import com.escuela.Quimica;
import com.escuela.Values;

class JUnit {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Initialize system school");
	}

	@Test
	void getCalification() {

		com.escuela.Test test = new Matematicas(Values.A);

		assertEquals(Values.A, test.getCalificacion());
	}

	
	@Test
	void campareValuesEquals() {

		Examen v = new Matematicas(Values.A);
		
		assertTrue(v.getCalificacion()==Values.A);
		
	}
	
	
	//Revisamos si una clase en especifico es intancia de otra
	@Test
	void compareIntanceOf() {
		Examen q = new Quimica(Values.A);
		assertTrue(q instanceof Quimica);
	}

}
