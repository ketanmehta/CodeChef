import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/problems/CSUB
 */ 
class CSUB {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			br.readLine();
			char[] arr = br.readLine().trim().toCharArray();
			long ones = 0;
			for(char c : arr){
				if(c == '1'){
					ones++;
				}
			}
			System.out.println((ones * (ones + 1)) / 2);
		}
		br.close();
	}
	
}
