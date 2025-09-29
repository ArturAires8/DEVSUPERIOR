package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Lesson> lessons = new ArrayList<Lesson>();

		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nDados da " + i + "a aula:");
			System.out.printf("Conteúdo ou tarefa (c/t)? ");
			char type = sc.nextLine().charAt(0);

			System.out.print("Título: ");
			String title = sc.nextLine();

			if (type == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();

				System.out.print("Duração em segudos: ");
				int seconds = sc.nextInt();
				sc.nextLine();
				lessons.add(new Video(title, url, seconds));

			} else if (type == 't') {
				System.out.print("Descrição: ");
				String description = sc.nextLine();

				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				sc.nextLine();
				lessons.add(new Task(title, description, questionCount));
			}
		}

		int totalDuration = 0;
		for (Lesson lesson : lessons) {
			totalDuration += lesson.duration();
		}
		System.out.println("\nDURAÇÃO TOTAL DO CURSO = " + totalDuration + " segundos");

		sc.close();
	}

}
