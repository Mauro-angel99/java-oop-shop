package generation.italy.shop;

public class Main {
	
public static void main(String[] args) {
	
		
		
		Prodotto prodotto = new Prodotto("jorda 1", "usata da jordan nel 1985", 250);
		System.out.println(prodotto);

		System.out.println("--------------------");
		
		System.out.println("prezzo + iva: " + prodotto.getPrezzoIva());

	}

}
