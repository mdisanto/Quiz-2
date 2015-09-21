

public class Tuition {

	public static double FourYearTuition(double tuition, double percentage, double APR) {
		double total = 0;
		for (int term = 1; term == 4; term++) {
			total = tuition + (tuition * APR);
			APR = APR + percentage;
		}
		return total;
	}
	public static double monthlyPayback(double tuition, double percentage, double APR) {
		double payment = FourYearTuition( tuition, percentage, APR);
		return payment/12;
	}
	
	
}
