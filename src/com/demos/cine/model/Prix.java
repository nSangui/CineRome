package com.demos.cine.model;

public class Prix {

	private double valeur;
	
	public Prix(double p) throws Exception{
		//si prix négatif on ne crée pas d'objet
		setPrix(p);
		if(p<0){
			throw new Exception("prix négatif");
		}
		valeur=p;
	}
	
	public void setPrix(double p) throws Exception {
		setPrix(p);
		if(p<0){
			throw new Exception("prix négatif");
		}
		valeur=p;
		
	}

	public double getPrix(){		
		return valeur;		
	}
	
}
