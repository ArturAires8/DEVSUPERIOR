package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employess will be registered? ");
		int N = scanner.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = scanner.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = scanner.nextInt();
			}

			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Salary: ");
			Double salary = scanner.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = scanner.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

		// Integer pos = position(list, idsalary);

		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = scanner.nextDouble();
			emp.increaseSalary(percent);

		}
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee e : list) {
			System.out.println(e);
		}
		scanner.close();

	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;

	}

}
