import java.util.Locale;
import java.util.Scanner;

public class ExercicioTerreno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a largura do terreno: ");
		double larguraTerreno = sc.nextDouble();

		System.out.print("Digite o comprimento do terreno: ");
		double comprimentoTerreno = sc.nextDouble();

		System.out.print("Digite o valor do metro quadrado: ");
		double valorMetroQuadrado = sc.nextDouble();

		double areaTerreno = larguraTerreno * comprimentoTerreno;
		double precoTerreno = areaTerreno * valorMetroQuadrado;

		System.out.printf("Area do terreno: %.2f%n", areaTerreno);
		System.out.printf("Preco do terreno: %.2f%n", precoTerreno);

		sc.close();

	}

}
