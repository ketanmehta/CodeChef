import java.util.Scanner;

/**
 * @author Ketan Mehta
 * @date
 * @problem_link https://www.codechef.com/problems/TRISQ
 */
class TRISQ {

	public static void main(String args[]) {
		int testCases,baseLength;
		Scanner sc = new Scanner(System.in);
		testCases = sc.nextInt();
		while ((testCases--) > 0) {
			baseLength = sc.nextInt();
			/*
			Firstly, divide 'b' or 'n' by 2 so we can deal with 1x1 squares.
			At the base, n-1 squares can be fit and it decreases by 1 as we go upwards. Hence the total number of squares is the sum=(n-1)+(n-2)+...+2+1.
			Summation of +ve: n is added n-1 times. Therefore, sum of n's is n(n-1).
			Summation of -ve: Summation of series of natural numbers is '(N)(N+1)/2'. Here N=n-1 so summation is n(n-1)/2.
			Subtracting -ve from +ve, we get: n(n-1)/2 or b(b-1)/2
			*/
			
			baseLength = baseLength/2;
			System.out.println(baseLength*(baseLength-1)/2);
		}
		sc.close();
	}
}
