
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Ketan Mehta
 * @date 
 * @problem_link 
 */

public class CIELRCPT {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int target = sc.nextInt();
			long res = 0;
			for(int x=11; x>-1; x--){
				res = (long) (res + (target / Math.pow(2, x)));
				target = (int) (target % Math.pow(2, x));
			}
			System.out.println(res);
		}
		br.close();
		sc.close();
	}
}
