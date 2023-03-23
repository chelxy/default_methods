package services;

public interface InterestService {
	
	Double getInterestRate();
	
	double payment(double amount, int months);

}
