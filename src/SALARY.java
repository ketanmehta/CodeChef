import java.util.Arrays;
import java.util.Scanner;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/problems/SALARY
 */ 
class SALARY {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int x=0; x<n; x++){
				arr[x] = sc.nextInt();
			}
			Arrays.sort(arr);
			int ans = 0;
			for(int x : arr){
				ans += x - arr[0];
			}
			System.out.println(ans);
		}
		sc.close();
	}
	
}
