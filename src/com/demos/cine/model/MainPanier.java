package com.demos.cine.model;

public class MainPanier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Panier p = new Panier();
		
		try{
			
		Article a1 = new Article("AR1", "Nounours", new Prix(10), 30);
		p.ajouter(a1, 3);
		}
		catch (Exception e){
			System.out.println("Article non créé par prix incorrect");
		}
		try{
		Article a2 = new Article("AR2", "PC", new Prix(600), 15);
		p.ajouter(a2, 1);
		}
		catch (Exception e){
			System.out.println("Article non créé par prix incorrect");
		}

		System.out.println(p);
		System.out.println(p.getPrixTotalHT());

	}

}
