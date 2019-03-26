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
		Voto voto = new Voto(0,nomeEsame,null);
		int pos=this.voti.indexOf(voto);
		if(pos==-1)
			return null;
		else
			return this.voti.get(pos);
	}
	
	/**
	 * dato un voto determina se esiste già un voto con uguale corso
	 * ed uguale punteggio
	 * @param v
	 * @return
	 */
	
	public boolean esisteGiaVoto(Voto v) {
		int pos=this.voti.indexOf(v);
		if(pos==-1)
			return false;
		else
			return (v.getPunti()==this.voti.get(pos).getPunti());
		
		/**
		Voto trovato=this.cercaEsame(v.getCorso());
		if(trovato==null)
			return false;
		if(trovato.getPunti()==v.getPunti()) {
			return true;
		}
		else {
			return false;
		}
		*/
	}
	
	

}
