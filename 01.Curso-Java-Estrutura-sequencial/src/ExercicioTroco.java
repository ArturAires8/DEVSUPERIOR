import java.util.Locale;
import java.util.Scanner;

public class ExercicioTroco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Preço unitário do produto: ");
		double precoUnitario = scanner.nextDouble();

		System.out.print("Quantidade comprada: ");
		int quantidadeComprada = scanner.nextInt();

		System.out.print("Dinheiro recebido: ");
		double dinheiroRecebido = scanner.nextDouble();

		double troco =  dinheiroRecebido - (precoUnitario * quantidadeComprada) ;

		System.out.printf("TROCO = %.2f%n", troco);

		scanner.close();

	}

}
