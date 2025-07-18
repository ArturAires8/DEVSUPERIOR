import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Estrutura repetitiva "enquanto"
		// Recomendada quando não se sabe previamente a quantidade de repetições
		int x = scanner.nextInt();

		int soma = 0;
		while (x != 0) {
			soma += x;

			x = scanner.nextInt();
		}

		System.out.println(soma);

		scanner.close();

	}

}
