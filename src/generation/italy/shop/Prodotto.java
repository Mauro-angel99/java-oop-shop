package generation.italy.shop;

import java.util.Random;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	int prezzo;
	int iva;
	
	
	public Prodotto(String nome, String descrizione, int prezzo) {
		
        Random rnd = new Random();
	    
	    int min = 10000;
	    int max = 99999;
	    int c = ((max - min) + 1);
	    
	    codice = rnd.nextInt(c) + min;
	    
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		iva = 20;
	}
	
	public int getPrezzo() {
		
		return prezzo;
	}
	public int getPrezzoIva() {
		
		int calcoloIva =  prezzo * iva / 100;
		return prezzo + calcoloIva;
	}
	
	@Override
	public String toString() {
		
		return "Il prodotto: " + nome +
			   "\ndescrizione: " + descrizione +
			   "\ncodice prodotto: " + codice +
			   "\nprezzo: " + prezzo;
	}

}
