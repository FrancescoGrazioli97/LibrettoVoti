package it.polito.tdp.libretto;

import java.util.*;

public class Libretto {
	private List<Voto> voti;
	
	public Libretto()
	{
		this.voti=new ArrayList<Voto>();
	}
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) { //metodo delegation
		voti.add(v);
	}
	
	
	/**
	 * seleziona il sottoinsieme di voti che hanno il punteggio indicato
	 * @param punti
	 * @return
	 */
	public List<Voto> cercaVoti (int punti) {
		List<Voto> result = new ArrayList<Voto>();
		
		for (Voto v: this.voti)
		{
			if(v.getPunti()==punti) {
				result.add(v);
			}
		}
		return result;
	}
	
	public Voto cercaEsame (String nomeEsame) {
		for(Voto v: this.voti) {
			if(v.getCorso().equals(nomeEsame)) {
				return v;
			}
		}
		return null;
	}
	
	

}
