import java.util.Locale;
import java.util.Scanner;

public class DesafioImposto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Renda anual com salário: ");
		double rendaSalarioAnual = sc.nextDouble();

		System.out.print("Renda anual com prestação de serviço: ");
		double rendaServicosAnual = sc.nextDouble();

		System.out.print("Renda anual com ganho de capital: ");
		double rendaCapitalAnual = sc.nextDouble();

		System.out.print("Gastos médicos: ");
		double gastosMedicos = sc.nextDouble();

		System.out.print("Gastos educacionais: ");
		double gastosEducacionais = sc.nextDouble();

		double salarioMensal = rendaSalarioAnual / 12.0;
		double impostoSalarioMensal = 0.0;

		if (salarioMensal >= 5000.0) {
			impostoSalarioMensal = salarioMensal * 0.20;
		} else if (salarioMensal >= 3000.0) {
			impostoSalarioMensal = salarioMensal * 0.10;
		}

		double impostoSalarioAnual = impostoSalarioMensal * 12;

		double impostoServicos = rendaServicosAnual * 0.15;
		double impostoCapital = rendaCapitalAnual * 0.20;

		double impostoBrutoTotal = impostoSalarioAnual + impostoServicos + impostoCapital;

		double gastosDedutiveis = gastosMedicos + gastosEducacionais;
		double maximoDedutivel = impostoBrutoTotal * 0.30;
		double abatimento = Math.min(gastosDedutiveis, maximoDedutivel);

		double impostoDevido = impostoBrutoTotal - abatimento;

		System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println("\nCONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f\n", impostoSalarioAnual);
		System.out.printf("Imposto sobre serviços: %.2f\n", impostoServicos);
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);

		System.out.println("\nDEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f\n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f\n", gastosDedutiveis);

		System.out.println("\nRESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", impostoBrutoTotal);
		System.out.printf("Abatimento: %.2f\n", abatimento);
		System.out.printf("Imposto devido: %.2f\n", impostoDevido);

		sc.close();

	}

}
