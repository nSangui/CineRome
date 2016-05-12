package com.demos.cine.model;

import java.util.ArrayList;

public class Panier {
	
	private ArrayList <LignePanier> contenu = new ArrayList<LignePanier>();
	

	public Panier() {
	}
	
	public void ajouter(Article a, int qteComm){
		LignePanier lp = new LignePanier(a, qteComm);
		contenu.add(lp);
	}

	@Override
	public String toString() {
		String description="";
		for(LignePanier lp:contenu){
			description +=
					lp.getA().getReference()+" "+lp.getQteCommandee()+"\n";
		}
		return description;
	}
	
	public double getPrixTotalHT(){
		double prix=0;
		for(LignePanier lp:contenu){
			prix += lp.getA().getPrixHT()*lp.getQteCommandee();	
		}
		return prix;
	}

}
