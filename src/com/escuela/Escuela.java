package com.escuela;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Escuela {

	public static void main(String[] args) {

		List<Examen> examenes = new ArrayList<>();

		examenes.add(new Matematicas(Values.A));
		examenes.add(new Quimica(Values.C));
		examenes.add(new Historia(Values.B));
		examenes.add(new Fisica(Values.F));
		examenes.add(new MecanicaCuantica(Values.D));

		for (Examen ex : examenes) {
			switch (ex.getCalificacion()) {
			case A:
				System.out.println("Calificacion exepcional para " + ex.getClass().getSimpleName());
				break;
			case B:
				System.out.println("Calificacion buena para " + ex.getClass().getSimpleName());
				break;
			case C:
				System.out.println("Calificacion regular para " + ex.getClass().getSimpleName());
				break;
			case D:
				System.out.println("Calificacion aprobatoria para " + ex.getClass().getSimpleName());
				break;
			default:
				System.out.println("Calificacion no deseada para " + ex.getClass().getSimpleName());

			}
		}

	}

}
