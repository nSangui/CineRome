package com.demos.cine.model;

public class MainPanier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Article a1 = new Article("AR1", "Nounours", 10, 30);
		Article a2 = new Article("AR2", "PC", 600);
		
		Panier p = new Panier();
		p.ajouter(a1, 3);
		p.ajouter(a2, 1);
		
		System.out.println(a2);
		System.out.println(p);
		System.out.println(p.getPrixTotalHT());

	}

}
