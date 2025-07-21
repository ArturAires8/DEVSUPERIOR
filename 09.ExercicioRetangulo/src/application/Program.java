package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.println("Entre com a largura e altura do retângulo: ");

		rectangle.width = scanner.nextDouble();
		rectangle.height = scanner.nextDouble();

		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETRO = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

		scanner.close();
	}

}
