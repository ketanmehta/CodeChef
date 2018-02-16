
import java.util.Scanner;

/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/ENCI2018/problems/PAD19
 */

class PAD19 {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			int n = sc.nextInt();
			long arr = 0;
			for(int j=0; j<n; j++){
				arr = arr + sc.nextLong();
			}
			double f = sc.nextDouble();
			System.out.printf("%.4f\n",arr * f);
		}
		sc.close();
	}
}
