import java.util.Scanner;

public class ExercicioTabuada {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n, produto;

		System.out.println("Deseja a tabuada para qual valor?");
		n = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			produto = n * i;
			System.out.printf("%d x %d = %d\n", n, i, produto);
		}

		scanner.close();

	}

}
