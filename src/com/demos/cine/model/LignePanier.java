package com.demos.cine.model;

public class LignePanier {
	
	Article a;
	int qteComm;
	
	public LignePanier(Article a, int qteCommandee) {	
		this.a = a;
		this.qteComm = qteCommandee;
	}

	public Article getA() {
		return a;
	}

	public int getQteCommandee() {
		return qteComm;
	}
	
	
	
	

}
