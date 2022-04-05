package desafios;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Bruno Silva
 * @version 0.0.1
 *
 */
public class CarrinhoDeCompras {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);

		// Informando os produtos
		int[] codigo = { 1, 2, 3, 4, 5, 6 };
		String[] produtos = { "Arroz", "Feijao", "Açucar", "Leite", "Nescau", "Óleo" };
		int[] estoque = { 10, 10, 10, 10, 10, 10 };
		double[] precos = { 21.99, 14.79, 10.39, 3.49, 7.89, 6.99 };
		final double tributos = 0.09;
		int cod, resultado, saldoProduto;
		String pergunta;
		double precoTotal;

		System.out.println("Bem-vindo ao mercadinho da esquina!\n");
		System.out.println("Abaixo segue a nossa lista de produtos para vocês estarem comprando:");
		System.out.println("====================================================================");
		System.out.println("Código        Descrição do Produto        Estoque        Valor ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println(codigo[0] + "             " + produtos[0] + "                       " + estoque[0]
				+ "         " + "    R$ " + precos[0]);
		System.out.println(codigo[1] + "             " + produtos[1] + "                      " + estoque[1]
				+ "         " + "    R$ " + precos[1]);
		System.out.println(codigo[2] + "             " + produtos[2] + "                      " + estoque[2]
				+ "         " + "    R$ " + precos[2]);
		System.out.println(codigo[3] + "             " + produtos[3] + "                       " + estoque[3]
				+ "         " + "    R$ " + precos[3]);
		System.out.println(codigo[4] + "             " + produtos[4] + "                      " + estoque[4]
				+ "         " + "    R$ " + precos[4]);
		System.out.println(codigo[5] + "             " + produtos[5] + "                        " + estoque[5]
				+ "         " + "    R$ " + precos[5]);
		System.out.println("====================================================================");
		System.out.println();
		System.out.print("Qual o produto que deseja comprar: ");
		resultado = sc.nextInt();

		if (resultado == 1) {
			System.out.print("Digite a quantidade desejada: ");
			resultado = sc.nextInt();

			while (resultado > estoque[0]) {
				System.out.print("A quantidade desejada não possui estoque. O estoque Atual é de: " + estoque[0]);
				System.out.print("Digite novamente a quantidade desejada: ");
				resultado = sc.nextInt();
			}

			saldoProduto = estoque[0] - resultado;

			System.out.print("Deseja acrescentar outro produto(S ou N)? ");
			pergunta = sc.next();
			if (pergunta == "S" || pergunta == "s") {

			} else {
				System.out.println();
				System.out.println();
				System.out.println("Total da sua compra: ");
				System.out.println(
						"Descrição do Produto        Qtd no Carrinho        Valor Unit.(R$)        Valor Total (R$)");
				System.out.printf(produtos[0] + "                       " + resultado + "         " + "             R$ "
						+ precos[0] + "               R$ %.2f", (precos[0] * resultado));
				System.out.println();
				System.out.println("====================================================================");
				System.out.println("Qual a forma de pagamento desejada?");
				System.out.println("[1]À vista em dinheiro, cartão de débito MASTERCARD ou Pix? (20% de desconto)");
				System.out.println("[2]À vista no cartão de crédito? (15% de desconto)");
				System.out.println("[3]Em 2x vezes no cartão de crédito MASTERCARD sem desconto e sem juros?");
				System.out.println("[4]Em três vezes no cartão de crédito MASTERCARD com juros de 10%");
				System.out.println("====================================================================");
				System.out.println();
				System.out.print("Digite sua escolha: ");
				int respPagamento = sc.nextInt();

				switch (respPagamento) {
				case 1:
					System.out.println("[1]Você escolheu pagamento à vista!");
					System.out.println();
					System.out.printf("Sua conta deu:\nValor Total:" + "R$ " + ((precos[0] * resultado) * 0.80)
							+ "\nImposto: R$ %.2f", (((precos[0] * resultado) * 0.80) * 0.09));

				case 2:
					System.out.println("[1]Você escolheu pagamento à vista!");
					System.out.println();
					System.out.printf("Sua conta deu:\nValor Total:" + "R$ " + ((precos[0] * resultado) * 0.80)
							+ "\nImposto: R$ %.2f", (((precos[0] * resultado) * 0.80) * 0.09));

				case 3:
					System.out.println("[1]Você escolheu pagamento à vista!");
					System.out.println();
					System.out.printf("Sua conta deu:\nValor Total:" + "R$ " + ((precos[0] * resultado) * 0.80)
							+ "\nImposto: R$ %.2f", (((precos[0] * resultado) * 0.80) * 0.09));

				case 4:
					System.out.println("[1]Você escolheu pagamento à vista!");
					System.out.println();
					System.out.printf("Sua conta deu:\nValor Total:" + "R$ " + ((precos[0] * resultado) * 0.80)
							+ "\nImposto: R$ %.2f", (((precos[0] * resultado) * 0.80) * 0.09));
				}
			}

		}

	}
}
