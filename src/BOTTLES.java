
import java.util.Scanner;

/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/ENCI2018/problems/BOTTLES
 */

class BOTTLES {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		long litres, size;
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			litres = sc.nextLong();
			size = sc.nextLong();
			long ans = 0;
			long sum = 0;
			while(sum < litres){
				ans++;
				sum = sum + size;
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
