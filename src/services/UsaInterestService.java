package services;

public class UsaInterestService implements InterestService {

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

}
