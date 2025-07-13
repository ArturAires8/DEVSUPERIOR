import java.util.Locale;
import java.util.Scanner;

public class ExercicioRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da base do retangulo: ");
		double valorBase = sc.nextDouble();

		System.out.print("Digite o valor da altura do retangulo: ");
		double valorAltura = sc.nextDouble();

		double area = valorAltura * valorBase;
		double perimetro = 2 * (valorAltura + valorBase);
		double diagonal = Math.sqrt(valorBase * valorBase + valorAltura * valorAltura);

		System.out.printf("AREA: %.4f%n", area);
		System.out.printf("PERIMETRO: %.4f%n", perimetro);
		System.out.printf("DIAGONAL: %.4f%n", diagonal);

		sc.close();

	}

}
