package com.demos.cine.model;

public class Article {
	
	private String reference;
	private String designation;
	private double prixHT;
	private int qteStock;
	private String type;
	
	public Article(String reference, String designation, double prixHT, int qteStock) {
		
		this.reference = reference;
		this.designation = designation;
		this.prixHT = prixHT;
		this.qteStock = qteStock;
	}
	
	

	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public String getReference() {
		return reference;
	}

	public String getDesignation() {
		return designation;
	}

	public int getQteStock() {
		return qteStock;
	}
	
	public void incrementStock(int qte){
		qteStock += qte;
	}
	
	public void decrementStock(int qte){
		qteStock -= qte;	
	}

	@Override
	public String toString() {
		return "Article [reference=" + reference + ", designation=" + designation + ", prixHT=" + prixHT + ", qteStock="
				+ qteStock + "]";
	}
	
	
	

}
