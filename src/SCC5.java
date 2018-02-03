
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ketan Mehta
 * @date 
 * @problem_link 
 */

public class SCC5 {

	public static void main(String args[]) throws Exception {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<t; i++){
			String[] toks = br.readLine().split(" ");
			int N = Integer.parseInt(toks[0]);
			boolean arr[] = new boolean[N + 1];
			int cx[] = new int[N + 1];
			Set<Integer> list = new HashSet<Integer>();
			int M = Integer.parseInt(toks[1]);
			for(int j=0; j<M; j++){
				toks = br.readLine().split(" ");
				int ix = Integer.parseInt(toks[0]);
				int mx = Integer.parseInt(toks[1]);
				list.add(ix);
				cx[mx]++;
				arr[ix] = true;
			}
			if(list.size() == (N - 1)){
				int count = 0;
				int index = 0;
				int answer = 0;
				for(boolean b : arr){
					if(!b){
						count++;
						if(count > 2)
							break;
						answer = index;
					}
					index++;
				}
				if(count == 2 && cx[answer] == N - 1){
					sb.append("alive " + answer + "\n");
				}
				else{
					sb.append("dead\n");
				}
			}
			else{
				sb.append("dead\n");
			}
		}
		System.out.println(sb);
		br.close();
	}
}
