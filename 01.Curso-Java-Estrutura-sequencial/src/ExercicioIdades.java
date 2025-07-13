import java.util.Locale;
import java.util.Scanner;

public class ExercicioIdades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		String nome1 = scanner.nextLine();
		System.out.print("Idade: ");
		int idade1 = scanner.nextInt();
		System.out.println("Dados da segunda pessoa: ");
		scanner.nextLine();
		System.out.print("Nome: ");
		String nome2 = scanner.nextLine();
		System.out.print("Idade: ");
		int idade2 = scanner.nextInt();

		double idadeMedia = (double) (idade1 + idade2) / 2.0;

		System.out.printf("A idade média de %s e %s é de %.1f%n ", nome1, nome2, idadeMedia);

		scanner.close();

	}

}
