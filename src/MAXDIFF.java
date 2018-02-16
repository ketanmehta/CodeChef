import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/problems/MAXDIFF
 */ 
class MAXDIFF {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String toks[] = null;
		for (int i = 0; i < t; i++) {
			toks = br.readLine().trim().split(" ");
			int n = Integer.parseInt(toks[0]);
			int k = Integer.parseInt(toks[1]);
			int[] list = new int[n];
			toks = br.readLine().split(" ");
			for(int j=0; j<n; j++){
				list[j] = Integer.parseInt(toks[j]);
			}
			Arrays.sort(list);
			int bacha = Math.min(k, n-k);
			long bachaSum = 0;
			long babaSum = 0;
			for(int x=0;x<bacha; x++){
				bachaSum += list[x];
			}
			for(int x=bacha;x<n; x++){
				babaSum += list[x];
			}
			System.out.println(babaSum - bachaSum);
		}
		br.close();
	}
	
}
