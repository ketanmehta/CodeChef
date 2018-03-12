import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/problems/STICKS
 */ 
class STICKS {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String toks[] = null;
		for (int i = 0; i < t; i++) {
			br.readLine();
			toks = br.readLine().trim().split(" ");
			int[] A = new int[toks.length];
			for(int j=0; j<toks.length; j++){
				A[j] = Integer.parseInt(toks[j]);
			}
			Arrays.sort(A);
			int found = 0;
			int ans = 1;
			for(int x=A.length-1; x>0; x--){
				if(A[x] == A[x-1]){
					ans =  ans * A[x];
					found = found + 2;
					x--;
				}
				if(found == 4){
					break;
				}
			}
			System.out.println(found == 4 ? ans : -1);
		}
		br.close();
	}
}
