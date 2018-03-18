import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/problems/CO92JUDG
 */ 
class CO92JUDG {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String toks[] = null;
		for (int i = 0; i < t; i++) {
			br.readLine();
			toks = br.readLine().trim().split(" ");
			int n = toks.length;
			long aliceSum=0;;
			long aliceMax=0;
			for(int j=0; j<n; j++){
				int num = Integer.parseInt(toks[j]);
				if(aliceMax < num){
					aliceMax = num;
				}
				aliceSum += num;
			}
			aliceSum = aliceSum - aliceMax;
			toks = br.readLine().trim().split(" ");
			long bobSum=0;;
			long bobMax=0;
			for(int j=0; j<n; j++){
				int num = Integer.parseInt(toks[j]);
				if(bobMax < num){
					bobMax = num;
				}
				bobSum += num;
			}
			bobSum = bobSum - bobMax;
			if(aliceSum == bobSum){
				System.out.println("Draw");
			}
			else if(aliceSum < bobSum){
				System.out.println("Alice");
			}
			else{
				System.out.println("Bob");
			}
		}
		br.close();
	}
}
