package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Test_libretto {

	public static void main(String[] args) {
		Libretto libr = new Libretto();
		
		libr.add(new Voto(30,"Analisi I",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(21,"Analisi II",LocalDate.of(2018, 1, 25)));
		libr.add(new Voto(25,"Fisica I",LocalDate.of(2017, 6, 15)));
		libr.add(new Voto(28,"Fisica II",LocalDate.of(2018, 9, 5)));
		libr.add(new Voto(18,"Geometria",LocalDate.of(2017, 1, 30)));
		libr.add(new Voto(20,"Economia",LocalDate.of(2018, 1, 28)));
		libr.add(new Voto(25,"Ricerca Operativa",LocalDate.of(2017, 7, 12)));
		libr.add(new Voto(24,"Complementi di economia",LocalDate.of(2018, 6, 27)));
		libr.add(new Voto(25,"Logisitica",LocalDate.of(2019, 1, 14)));
		libr.add(new Voto(27,"Programmazione a oggetti",LocalDate.of(2019, 2, 3)));

		
	}

}