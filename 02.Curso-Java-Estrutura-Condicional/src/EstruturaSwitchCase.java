import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor para representar o dia da semana (1 a 7): ");
		int diaSemana = scanner.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.print("Domingo");
			break;
		case 2:
			System.out.print("Segunda");
			break;
		case 3:
			System.out.print("Terça");
			break;
		case 4:
			System.out.print("Quarta");
			break;
		case 5:
			System.out.print("Quinta");
			break;
		case 6:
			System.out.print("Sexta");
			break;
		case 7:
			System.out.print("Sábado");
			break;

		default:
			System.out.println("Dia da semana: valor inválido");
			break;
		}

		scanner.close();

	}

}
