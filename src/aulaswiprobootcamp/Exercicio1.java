package aulaswiprobootcamp;

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		/**
		 * 1 . Escreva um programa Java que gera um número aleatório (randômico) entre 0
		 * e 10 (incluindo estes dois valores) e peça ao usuário para adivinhá-lo. Use
		 * um laço while para registrar as tentativas feitas e, a cada tentativa, dê
		 * dicas informando se o número gerado é maior ou menor que a tentativa feita.
		 * Finalmente mostre a quantidade de tentativas feitas até que o número fosse
		 * acertado.
		 */
		Random numero = new Random();
		Scanner sc = new Scanner(System.in);

		int valor = numero.nextInt(11);
		int resultado;
		int count = 1;

		System.out.print("Adivinhe o número que irá aparecer na tela: ");
		resultado = sc.nextInt();

		while (resultado != valor) {
			count++;
			System.out.print("Errado. ");

			if (resultado > valor) {
				System.out.print("O número que foi digitado é maior, digite novamente: ");
			}
			if (resultado < valor) {
				System.out.print("O número que foi digitado é menor, digite novamente: ");
			}

			resultado = sc.nextInt();

		}

		System.out.printf("Parabéns você acertou após %d tentativas", count);
		sc.close();

	}

}
