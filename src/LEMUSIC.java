import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/problems/LEMUSIC
 */ 

class Pair{
	public Long band;
	public Long length;
	public Pair(long band, long length){
		this.band = band;
		this.length = length;
	}
}
class LEMUSIC {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String toks[] = null;
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			Pair[] pair = new Pair[n];
			for(int j=0; j<n; j++){
				toks = br.readLine().trim().split(" ");
				pair[j] = new Pair(Integer.parseInt(toks[0]), Integer.parseInt(toks[1]));
			}
			Arrays.sort(pair, new Comparator<Pair>() {
				@Override
				public int compare(Pair o1, Pair o2) {
					int res = o1.band.compareTo(o2.band);
					if(res == 0){
						res = o1.length.compareTo(o2.length);
					}
					return res;
				}
				
			});
			long total = 0;
			List<Long> nums = new ArrayList<Long>();
			for(int j=0; j<n; j++){
				if(j == 0 || pair[j-1].band < pair[j].band){
					nums.add(pair[j].length);
				}
				else{
					total = total + pair[j].length;
				}
			}
			long ans = nums.size() * total;
			Collections.sort(nums);
			int index = 1;
			for(long l : nums){
				ans = ans + ( index * l);
				index++;
			}
			System.out.println(ans);
		}
		br.close();
	}
}
