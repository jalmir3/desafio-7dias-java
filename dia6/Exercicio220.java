package dia6;

import java.util.Scanner;

public class Exercicio220 {
	// Write a Java program to compute and print sum of two given integers (more
	// than or equal to
	// zero). If given integers or the sum have more than 80 digits, print
	// "overflow".
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, soma;
		System.out.println("Digite o primeiro numero");
		n1 = sc.nextInt();
		while (n1 < 0) {
			System.out.println("Redigite o primeiro numero(somente aceita numero maior ou igual a zero)");
			n1 = sc.nextInt();
		}
		System.out.println("Digite o segundo numero");
		n2 = sc.nextInt();
		while (n2 < 0) {
			System.out.println("Redigite o segundo numero(somente aceita numero maior ou igual a zero)");
			n2 = sc.nextInt();
		}
		soma = n1 + n2;
		System.out.println("Soma:" + soma);
		if (soma > 80) {
			System.out.println("Overflow");
		}
	}

}
