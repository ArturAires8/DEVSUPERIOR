import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaIdade {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int idade, npessoas;
		double soma, media;

		System.out.println("Digite as idades: ");
		idade = scanner.nextInt();

		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			soma = 0;
			npessoas = 0;
			while (idade >= 0) {
				soma = soma + idade;
				npessoas++;
				idade = scanner.nextInt();
			}
			media = soma / npessoas;

			System.out.printf("MÉDIA = %.2f%n", media);
		}

		scanner.close();

	}

}
