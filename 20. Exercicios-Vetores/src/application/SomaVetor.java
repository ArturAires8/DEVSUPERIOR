package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double soma, media;

		System.out.print("Quantos numeros voce vai digitar?");
		int n = scanner.nextInt();

		double vetor[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = scanner.nextDouble();
		}

		soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}

		media = soma / n;

		System.out.print("VALORES = ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		System.out.printf("\nSoma = %.2f\n",soma);
		System.out.printf("MEDIA = %.2f\n",media);
	
	}

}
