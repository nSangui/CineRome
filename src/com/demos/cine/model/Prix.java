package com.demos.cine.model;

public class Prix {

	private double valeur;
	
	public Prix(double p) throws Exception{
		//si prix n�gatif on ne cr�e pas d'objet
		setPrix(p);
		if(p<0){
			throw new Exception("prix n�gatif");
		}
		valeur=p;
	}
	
	public void setPrix(double p) throws Exception {
		setPrix(p);
		if(p<0){
			throw new Exception("prix n�gatif");
		}
		valeur=p;
		
	}

	public double getPrix(){		
		return valeur;		
	}
	
}
