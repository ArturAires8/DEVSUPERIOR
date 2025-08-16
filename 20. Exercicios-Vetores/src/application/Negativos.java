package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scanner.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scanner.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");

		for (int i = 0; i < n; i++) {
			if (vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}

		scanner.close();

	}
}