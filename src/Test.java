import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Ketan Mehta
 * @date
 * @problem_link https://skillenza.com/challenge/nestaway-online-backend-dev-
 *               recruitmentdrive2/checkpoint/submit/572
 */

class Test {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] toks = null;
		toks = br.readLine().split(" ");
		int k = Integer.parseInt(toks[0]);
		int l = Integer.parseInt(toks[0]);
		int [] votes = new int[k+1];
		toks = br.readLine().trim().split(" ");
		for(String s : toks){
			votes[Integer.parseInt(s)]++;
		}
		int answer = 0;
		for(Integer i : votes){
			if(i>=l){
				answer++;
			}
		}
		System.out.println(answer);
		
		br.close();
	}
}
