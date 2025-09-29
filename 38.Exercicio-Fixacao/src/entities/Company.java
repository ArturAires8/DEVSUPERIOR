package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployess;

	public Company() {
		
	}
	
	public Company(String name, Double anulIncome, Integer numberOfEmployess) {
		super(name, anulIncome);
		this.numberOfEmployess = numberOfEmployess;
	}

	public Integer getNumberOfEmployess() {
		return numberOfEmployess;
	}

	public void setNumberOfEmployess(Integer numberOfEmployess) {
		this.numberOfEmployess = numberOfEmployess;
	}

	@Override
	public Double tax() {
		
		if (numberOfEmployess > 10) {
			return getAnulIncome() * 0.14;
		}else {
			return getAnulIncome() * 0.16;
		}
	}
}
	

