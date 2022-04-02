package aulaswiprobootcamp;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		/**
		 * 2. Faça um programa para receber o nome de um aluno e informar 2 notas, em
		 * seguida calcular a média do aluno e apresentar ao final a média calculada e a
		 * situação de Aprovação do aluno. (aprovado com média >= 6).
		 */

		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);

		String nome;
		double nota1, nota2, media;

		System.out.print("Digite o nome do aluno: ");
		nome = sc.next();

		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();

		System.out.print("Digite a primeira nota: ");
		nota2 = sc.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.printf("O aluno " + nome + " teve média de " + media + " e foi aprovado ");
		} else {
			System.out.printf("O aluno " + nome + " teve média de " + media + " e foi reprovado ");
		}

	}
}
