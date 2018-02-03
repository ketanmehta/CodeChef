import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/problems/FRGTNLNG
 */ 
class FRGTNLNG {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String toks[] = null;
		for (int i = 0; i < t; i++) {
			toks = br.readLine().trim().split(" ");
			int n = Integer.parseInt(toks[0]);
			int k = Integer.parseInt(toks[1]);
			List<String> list = new ArrayList<String>();
			toks = br.readLine().split(" ");
			for(int j=0; j<n; j++){
				list.add(toks[j]);
			}
			boolean[] bool = new boolean[n];
			for(int u=0; u<k; u++){
				toks = br.readLine().split(" ");
				int l = Integer.parseInt(toks[0]);
				for(int j=1; j<toks.length; j++){
					String st = toks[j];
					if(list.contains(st)){
						bool[list.indexOf(st)] = true;
					}
				}
			}
			for(boolean b : bool){
				System.out.print(b ? "YES " : "NO ");
			}
			System.out.println();
		}
		br.close();
	}
	
}
