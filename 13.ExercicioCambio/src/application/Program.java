package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do dolar: ");
		double dolarPreco = scanner.nextDouble();

		System.out.print("Quantos dólares serão comprados: ");
		double quantidadeDolares = scanner.nextDouble();

		double resultado = CurrencyConverter.calculoDolar(dolarPreco, quantidadeDolares);

		System.out.printf("Valor a ser pago em reais  = %.2f%n", resultado);
		scanner.close();
	}

}
