package entities;

public class Individual extends TaxPayer {

	private Double heathExpenditures;

	public Individual() {

	}

	public Individual(String name, Double anulIncome, Double heathExpenditures) {
		super(name, anulIncome);
		this.heathExpenditures = heathExpenditures;
	}

	public Double getHeathExpenditures() {
		return heathExpenditures;
	}

	public void setHeathExpenditures(Double heathExpenditures) {
		this.heathExpenditures = heathExpenditures;
	}

	@Override
	public Double tax() {
		double basicTax;
		if (getAnulIncome() < 20000.0) {
			basicTax = getAnulIncome() * 0.15;
		} else {
			basicTax = getAnulIncome() * 0.25;
		}
		basicTax -= getHeathExpenditures() * 0.5;
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}
}
