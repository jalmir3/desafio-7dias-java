package dia2;

import java.util.Arrays;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] vetor = new int[10];
		String[] vetor2 = { "Jalmir", "Maria", "Carlos", "André", "Zuleide" };
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(100);
		}
		System.out.println("Vetor original de numeros : " + Arrays.toString(vetor));
		Arrays.sort(vetor);
		System.out.println("Vetor ordenado : " + Arrays.toString(vetor));

		System.out.println("Vetor original de nomes  : " + Arrays.toString(vetor2));
		Arrays.sort(vetor2);
		System.out.println("Vetor de nomes em ordem crescente : " + Arrays.toString(vetor2));
	}

}
