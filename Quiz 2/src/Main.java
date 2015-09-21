import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner x = new Scanner(System.in);

	System.out.println("Enter Initial Tuition");
	double tuition = x.nextDouble();
	System.out.println("Enter Percentage Increase");
	double percentage = x.nextDouble();
	System.out.println("Enter APR");
	double APR = x.nextDouble();
	
	System.out.println("Total tuition is $"+Double.toString(Tuition.FourYearTuition( tuition, percentage, APR)));
	System.out.println("With a monthly pay rate of $"+Double.toString(Tuition.monthlyPayback( tuition, percentage, APR)));
	
	}
}
