package week.day1;

public class LearnFactorial {

	public static void main(String[] args) {

		// 5*4*3*2*1 = 120

		int number = 5;
		int fact = 1;

		for (int i = 1; i <= number; i++)
			fact = fact * i;

		System.out.println("5*4*3*2*1 = " + fact);

	}

}
