package dia1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
	// Escreva um programa Java para testar se um vetor contém um valor específico.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] vetor = new int[10];
		int num;
		boolean comparativo = false;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextInt(100);
			System.out.println(vetor[i]);
		}
		System.out.println("Digite um valor para comparar:");
		num = sc.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (num == vetor[i]) {
				comparativo = true;
				break;
			}

		}
		if (comparativo == true) {
			System.out.println("O numero digitado está no vetor aletório");
		} else {
			System.out.println("O numero digitado NÂO está no vetor aletório");
		}
		sc.close();
	}

}
