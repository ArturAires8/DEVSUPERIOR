import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosParte1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);

		int a;
		a = sc.nextInt();
		System.out.println("Você digitou: " + a);

		double b;
		b = sc.nextDouble();
		System.out.println("Você digitou: " + b);

		char d;
		d = sc.next().charAt(0);
		System.out.println("Você digitou: " + d);

		sc.close();

	}

}
