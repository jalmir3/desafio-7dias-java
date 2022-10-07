package dia5;

import java.util.Scanner;

public class Exercicio3 {
	// Take three numbers from the user and print the greatest number.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextInt();

		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextInt();

		System.out.print("Digite o terceiro numero: ");
		n3 = sc.nextInt();

		if (n1 > n2 && n1 > n3)
			System.out.println("O maior é o número: " + n1);

		if (n2 > n1 && n2 > n3)
			System.out.println("O maior é o número: " + n2);

		if (n3 > n1 && n3 > n2)
			System.out.println("O maior é o número: " + n3);

		sc.close();
	}

}
