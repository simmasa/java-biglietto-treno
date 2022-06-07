package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		int anni;
		float km;
		
		Scanner richeste = new Scanner(System.in);
		
		System.out.println("Inserisci la tua età: ");
		anni = richeste.nextInt();
		
		System.out.println("Inserisci i kilometri che devi percorrere: ");
		km = richeste.nextInt();
		
		if (km<0 || anni<0 ) {
			System.out.println("Valori invalidi");
		} else if (anni < 18) {
			System.out.print("Il prezzo del biglietto è: ");
			System.out.print(km*(0.21-(0.21*0.2)));
			System.out.print("€");
		} else if (anni >= 65) {
			System.out.print("Il prezzo del biglietto è: ");
			System.out.print(km*(0.21-(0.21*0.4)));
			System.out.print("€");
		} else {
			System.out.print("Il prezzo del biglietto è: ");
			System.out.print(km*0.21);
			System.out.print("€");
		}
	}

}
