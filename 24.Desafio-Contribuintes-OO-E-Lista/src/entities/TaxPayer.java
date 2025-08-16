package entities;

public class TaxPayer {

	private double salaryIncome;
	private double serviceIncome;
	private double capitalIncome;
	private double heathSpending;
	private double educationSpending;

	public TaxPayer() {

	}

	public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double heathSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.heathSpending = heathSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public double getServiceIncome() {
		return serviceIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public double getHeathSpending() {
		return heathSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public double salaryTax() {
		double month = salaryIncome / 12;
		if (month < 3000) {
			return 0;
		} else if (month < 5000) {
			return salaryIncome * 0.1;
		} else {
			return salaryIncome * 0.2;
		}

	}

	public double servicesTax() {
		return this.serviceIncome * 0.15;
	}

	public double capitalTax() {
		return this.capitalIncome * 0.20;
	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		double maxRebate = grossTax() * 0.3;
		double totalSpending = heathSpending + educationSpending;
		return Math.min(maxRebate, totalSpending);
	}

	public double netTax() {
		return grossTax() - taxRebate();
	}
}
