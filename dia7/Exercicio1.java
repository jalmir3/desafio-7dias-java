package dia7;

import java.util.Scanner;

public class Exercicio1 {
	// Write a Java program to get the character at the given index within the
	// String.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite uma palavra");
		nome = sc.next();

		System.out.println("Primeira letra da palavra digitada= " + nome.charAt(0));
		System.out.println("Ultima letra da palavra digitada= " + nome.charAt(nome.length() - 1));

		sc.close();
	}

}
