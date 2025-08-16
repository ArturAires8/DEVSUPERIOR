package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = scanner.nextInt();
		System.out.println();

		List<TaxPayer> taxpayers = new ArrayList<TaxPayer>();

		for (int i = 0; i < n; i++) {
			System.out.println("\nDigite os dados do " + (i + 1) + "o contribuinte:");
			System.out.print("Renda anual com o salário: ");
			double salaryIncome = scanner.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servicesIncome = scanner.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = scanner.nextDouble();
			System.out.print("Gastos médicos: ");
			double heathSpending = scanner.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpending = scanner.nextDouble();
			System.out.println();
			taxpayers.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, heathSpending, educationSpending));
		}
		for (int i = 0; i < taxpayers.size(); i++) {
			TaxPayer tp = taxpayers.get(i);
			System.out.println("\nResumo do " + (i + 1) + "o contribuinte:");
			System.out.printf("Imposto bruto total: %.2f%n", tp.grossTax());
			System.out.printf("Abatimento: %.2f%n", tp.taxRebate());
			System.out.printf("Imposto devido: %.2f%n", tp.netTax());

		}

		scanner.close();

	}

}
