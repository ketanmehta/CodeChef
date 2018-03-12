import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/problems/HILLS
 */ 
class HILLS {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String toks[] = null;
		for (int i = 0; i < t; i++) {
			toks = br.readLine().trim().split(" ");
			int n,u,d;
			n = Integer.parseInt(toks[0]);
			u = Integer.parseInt(toks[1]);
			d = Integer.parseInt(toks[2]);
			long[] hills = new long[n];
			toks = br.readLine().trim().split(" ");
			for(int j=0; j<n; j++){
				hills[j] = Integer.parseInt(toks[j]);
			}
			System.out.println(solve(hills,u,d));
		}
		br.close();
	}

	private static long solve(long[] hills, long u, long d) {
		long answer = 1;
		long lifeline = 1;
		for(int i=1; i<hills.length; i++){
			long current = hills[i-1];
			long next = hills[i];
			if(current == next){
				answer++;
				continue;
			}
			boolean currentIsMax = current > next;
			long lowerJump,higherJump;
			if(currentIsMax){
				lowerJump = current - next;
				if(lowerJump <= d){
					answer++;
					continue;
				}
				else if(lifeline == 1){
					lifeline -- ;
					answer++;
					continue;
				}
				else{
					break;
				}
			}
			else{
				higherJump = next - current;
				if(higherJump <= u){
					answer++;
					continue;
				}
				else{
					break;
				}
			}
		}
		return answer;
	}
}
