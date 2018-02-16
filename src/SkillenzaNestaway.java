import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Ketan Mehta
 * @date
 * @problem_link https://skillenza.com/challenge/nestaway-online-backend-dev-
 *               recruitmentdrive2/checkpoint/submit/572
 */

class SkillenzaNestaway {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] toks = null;
		for (int i = 0; i < t; i++) {
			toks = br.readLine().split(" ");
			int n = Integer.parseInt(toks[0]);
			int c = Integer.parseInt(toks[1]);
			int cp = 0;
			int p = 0;
			toks = br.readLine().split(" ");
			long maxSoFar = 0, maxEnd = 0;
			for (int j = 0; j < n; j++) {
				cp = Integer.parseInt(toks[j]);
				p = c - cp;
				maxEnd = Math.max(p, maxEnd + p);
				maxSoFar = Math.max(maxSoFar, maxEnd);
			}
			sb.append((maxSoFar < 0 ? 0 : maxSoFar) + "\n");
		}
		System.out.print(sb);
		br.close();
	}
}
