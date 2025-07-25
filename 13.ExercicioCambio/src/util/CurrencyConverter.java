package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;

	public static double calculoDolar(double dolarPreco, double quantidadeDolares) {
		return dolarPreco * quantidadeDolares * (1.0 + IOF);

	}
}