package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = scanner.nextLine();
		System.out.print("Vida inicial: ");
		int life = scanner.nextInt();
		System.out.print("Ataque: ");
		int attack = scanner.nextInt();
		System.out.print("Armadura: ");
		int armor = scanner.nextInt();
		scanner.nextLine();

		Champion A = new Champion(name, life, attack, armor);

		System.out.println();

		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		name = scanner.nextLine();
		System.out.print("Vida inicial: ");
		life = scanner.nextInt();
		System.out.print("Ataque: ");
		attack = scanner.nextInt();
		System.out.print("Armadura: ");
		armor = scanner.nextInt();

		Champion B = new Champion(name, life, attack, armor);

		System.out.println();

		System.out.print("Quantos turnos você deseja executar? ");
		int n = scanner.nextInt();

		int turn = 0;
		while (turn < n && A.getLife() != 0 && B.getLife() != 0) {

			turn++;
			A.takeDamage(B);
			B.takeDamage(A);

			System.out.println();
			System.out.println("Resultado do turno " + turn + ":");
			System.out.println(A.status());
			System.out.println(B.status());

		}
		System.out.println();
		System.out.println("FIM DO COMBATE");
		scanner.close();
	}

}
