package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Student student = new Student();

		student.name = scanner.nextLine();
		student.note1 = scanner.nextDouble();
		student.note2 = scanner.nextDouble();
		student.note3 = scanner.nextDouble();

		System.out.printf("NOTA FINAL = %.2f%n", student.notaFinal());

		if (student.notaFinal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTAM %.2f PONTOS%n", student.missingPoints());
		} else {
			System.out.println("APROVADO");
		}

	}

}
