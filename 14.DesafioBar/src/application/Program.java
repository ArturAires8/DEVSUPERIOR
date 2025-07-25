package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Bill bill = new Bill();

		System.out.print("Sexo: ");
		bill.gender = scanner.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		bill.beer = scanner.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = scanner.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = scanner.nextInt();
		
		System.out.println();
		
		System.out.println("RELATÓRIO: ");
		System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
		if (bill.cover() == 0.0) {
			System.out.println("Isento de Couvert");
		} else {
			System.out.printf("Couvert = R$ %.2f%n", bill.cover());
		}
		
		System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", bill.total());

		scanner.close();

	}

}
