import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Ketan Mehta
 * @date
 * @problem_link LUCKFOUR
 */

class LUCKFOUR {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++){
			System.out.println(br.readLine().chars().filter(c -> (char)c == '4').count());
		}
		br.close();
	}
}
