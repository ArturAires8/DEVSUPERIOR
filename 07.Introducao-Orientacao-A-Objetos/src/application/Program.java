package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the measures of triangle x: ");

		Triangle x = new Triangle();
		Triangle y = new Triangle();

		x.a = scanner.nextDouble();
		x.b = scanner.nextDouble();
		x.c = scanner.nextDouble();

		System.out.println("Enter the measures of triangle y");

		y.a = scanner.nextDouble();
		y.b = scanner.nextDouble();
		y.c = scanner.nextDouble();

		double areaX = x.area();
		double areaY=y.area();
		
		System.out.printf("Triangle x area: %.4f%n", areaX);
		System.out.printf("Triangle x area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X: ");
		} else {
			System.out.println("Larger area: Y: ");
		}

		scanner.close();

	}

}
