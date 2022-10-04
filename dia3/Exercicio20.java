package dia3;

import java.util.ArrayList;

public class Exercicio20 {
    //Write a Java program to convert an array to ArrayList.
	public static void main(String[] args) {
		String[]  vetorString = new String[] {"Casa", "Carro", "Moto",  "Aviao", "Navio"};
		
		ArrayList<String>  listaString = new ArrayList<String>();
        
		for (int i=0;i<vetorString.length;i++) {
			listaString.add(vetorString[i]);
		}
		System.out.println(listaString);
	}

}
