package entities;

public class Account {

	public static final double TAXA_SAQUE = 5.00;

	private int number;
	private String holder;
	private double balance;

	public Account() {

	}

	public Account(int number, String holder) {

		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {

		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amout) {
		balance += amout;

	}

	public void withdraw(double amout) {
		double totalDebit = amout + TAXA_SAQUE;
		balance -= totalDebit;

	}

	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);

	}

}
