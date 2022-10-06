package dia4;

import java.util.Scanner;

public class Exercicio5 {
	//Write a Java program that keeps a number from the user and generates an integer between 
	//1 and 7 and displays the name of the weekday.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int dia;
		String diaEscolhido;
		System.out.print("Digite o dia da semana(1 a 7): ");
		dia = sc.nextInt();

		switch (dia) {
		case 1:
			diaEscolhido = "Segunda-feira";
			break;
		case 2:
			diaEscolhido = "Terça-feira";
			break;
		case 3:
			diaEscolhido = "Quarta-feira";
			break;
		case 4:
			diaEscolhido = "Quinta-feira";
			break;
		case 5:
			diaEscolhido = "Sexta-feira";
			break;
		case 6:
			diaEscolhido = "Sabado";
			break;
		case 7:
			diaEscolhido = "Domingo";
			break;
		default:
			diaEscolhido = "Dia incorreto";
		}
		System.out.println(diaEscolhido);

		sc.close();
	}
}
