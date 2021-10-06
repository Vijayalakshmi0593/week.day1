package week.day1;

public class LearnFibonacciSeries {

	public static void main(String[] args) {
		// input (range): 8 output: 0,1,1,2,3,5,8,13

		int Firstnum = 0;
		int Secnum = 1;
		int range = 8;
		int sum;
		System.out.println("Fibonacci Series:");

		System.out.println(Firstnum);
		System.out.println(Secnum);

		for (int i = 1; i <= range - 2; i++) {
			sum = Firstnum + Secnum;
			System.out.println(sum);
			Firstnum = Secnum;
			Secnum = sum;

		}

	}
}
