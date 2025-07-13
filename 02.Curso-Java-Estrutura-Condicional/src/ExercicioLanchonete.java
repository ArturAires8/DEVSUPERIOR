import java.util.Locale;
import java.util.Scanner;

public class ExercicioLanchonete {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Codigo do produto comprado: ");
		int codigo = scanner.nextInt();

		System.out.print("Quantidade comprada: ");
		int quantidade = scanner.nextInt();

		double pagar = 0;

		if (codigo == 1) {
			pagar = quantidade * 5.00;
		} else if (codigo == 2) {
			pagar = quantidade * 3.50;
		} else if (codigo == 3) {
			pagar = quantidade * 4.80;
		} else if (codigo == 4) {
			pagar = quantidade * 8.90;
		} else if (codigo == 5) {
			pagar = quantidade * 7.32;
		}

		System.out.printf("Valor a pagar: R$ %.2f%n",pagar);
		
		
		scanner.close();

	}

}
