
import java.util.Scanner;

/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/ENCI2018/problems/CHEFBAM
 */

class CHEFBAM {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			int n = sc.nextInt();
			int x = sc.nextInt();
			double mid = n/2;
			double ans = (n+1)*mid;
			boolean possible = (int)ans == x;
			if(possible){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
		sc.close();
	}
}
