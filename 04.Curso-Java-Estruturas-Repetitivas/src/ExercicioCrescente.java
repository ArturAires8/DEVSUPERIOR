import java.util.Scanner;

public class ExercicioCrescente {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x, y;

		System.out.println("Digite dois números: ");
		x = scanner.nextInt();
		y = scanner.nextInt();

		while (x != y) {
			if (x > y) {
				System.out.println("DESCRESCENTE!");
			} else {
				System.out.println("CRESCENTE!");

			}

			System.out.println("Digite outros dois numeros:");
			x = scanner.nextInt();
			y = scanner.nextInt();
		}

		scanner.close();

	}

}
