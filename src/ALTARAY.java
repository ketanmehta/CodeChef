import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/problems/ALTARAY
 */ 
class ALTARAY {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String toks[] = null;
		for (int i = 0; i < t; i++) {
			toks = br.readLine().trim().split(" ");
			int n = Integer.parseInt(toks[0]);
			int[] A = new int[n];
			toks = br.readLine().split(" ");
			for(int j=0; j<n; j++){
				A[j] = Integer.parseInt(toks[j]);
			}
			int[] ans = new int[n];
			Arrays.fill(ans, 1);
			for(int x = n-2; x >= 0; x--) {
				if((A[x] > 0) != (A[x+1] > 0)){
					ans[x] = ans[x+1]+1;
				}
				else {
					ans[x] =1;
				}
			}
			for(int x =0; x < n; x++){
				System.out.print(ans[x] + " ");;
			}
			System.out.println();
		}
		br.close();
	}
}
