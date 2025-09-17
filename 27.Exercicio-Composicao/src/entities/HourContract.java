package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHourDouble;
	private Integer hours;

	public HourContract() {

	}

	public HourContract(Date date, Double valuePerHourDouble, Integer hours) {
		this.date = date;
		this.valuePerHourDouble = valuePerHourDouble;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHourDouble() {
		return valuePerHourDouble;
	}

	public void setValuePerHourDouble(Double valuePerHourDouble) {
		this.valuePerHourDouble = valuePerHourDouble;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double totalValue() {
		return valuePerHourDouble * hours;
	}

}
