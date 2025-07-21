package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Nome: ");
		employee.name = scanner.nextLine();
		System.out.print("Salário bruto: ");
		employee.grossSalary = scanner.nextDouble();
		System.out.print("Imposto: ");
		employee.tax = scanner.nextDouble();

		System.out.println();
		System.out.print("Funcionario: " + employee);
		System.out.println();
		System.out.print("Qual a porcentage para aumentar o salário?");
		double percentage = scanner.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		System.out.print("Dados atualizados: " + employee);

		scanner.close();

	}

}
