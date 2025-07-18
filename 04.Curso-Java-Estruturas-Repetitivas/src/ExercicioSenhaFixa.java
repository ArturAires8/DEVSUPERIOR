import java.util.Scanner;

public class ExercicioSenhaFixa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int senha;

		System.out.println("Digite a senha: ");
		senha = scanner.nextInt();

		while (senha != 2002) {
			System.out.print("Senha Invalida! Tente novamente:");
			senha = scanner.nextInt();
		}

		System.out.println("Acesso permitido!\n");
		scanner.close();

	}

}
