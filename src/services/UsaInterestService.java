package services;

public class UsaInterestService implements InterestService{
	
	private Double interestRate;

	public UsaInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public double payment(double amount, int months) {
		return amount * Math.pow(1 + interestRate / 100.0, months);
	}
}
