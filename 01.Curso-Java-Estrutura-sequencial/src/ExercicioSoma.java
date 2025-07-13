import java.util.Scanner;

public class ExercicioSoma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor de x: ");
		int x = scanner.nextInt();

		System.out.print("Digite o valor de y: ");
		int y = scanner.nextInt();

		int soma = x + y;

		System.out.println("SOMA = " + soma);

		scanner.close();

	}

}
