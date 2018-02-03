
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ketan Mehta
 * @date 
 * @problem_link 
 */

public class SIMPSTAT {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0; j<n; j++){
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			long sum = 0;
			for(int j=k;j<n-k;j++){
				sum += arr[j];
			}
			System.out.println((double)sum/(n-(k*2)));
		}
		br.close();
		sc.close();
	}
}
