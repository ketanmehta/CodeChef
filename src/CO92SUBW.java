import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/problems/CO92JUDG
 */ 
class CO92SUBW {
	public static TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	static{
		int number = 1;
		int incr = 1;
		for(int i=1; ; i++){
			map.put(number, i);
			number = number + (++incr);
			if(number > 1999999999){
				break;
			}
		}
	}
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x <= 2){
				System.out.println(x);
				continue;
			}
			Integer nearestStation = map.ceilingKey(x);
			Integer nearestStat2 = map.floorKey(x);
			if(nearestStat2 == null){
				nearestStat2 = Integer.MIN_VALUE;
			}
			int cost1 = Integer.MAX_VALUE;
			int cost2 = Integer.MAX_VALUE;
			if(nearestStation == null){
				//throw new Exception("");
			}
			else if(nearestStation == x){
				System.out.println(map.get(nearestStation));
				continue;
			}
			else if(nearestStat2 == x){
				System.out.println(map.get(nearestStat2));
				continue;
			}
			else if(nearestStation < x){
				int currentCost = map.get(nearestStation);
				currentCost = currentCost + (x - nearestStation);
				cost1 = currentCost;
			}
			else if(nearestStation > x){
				int currentCost = map.get(nearestStation);
				currentCost = currentCost + (nearestStation - x);
				cost1 = currentCost;
			}
			if(nearestStat2 < x){
				Integer currentCost = map.get(nearestStat2);
				if(currentCost != null){
					currentCost = currentCost + (x - nearestStat2);
					cost2 = currentCost;
				}
			}
			else if(nearestStat2 > x){
				Integer currentCost = map.get(nearestStat2);
				if(currentCost != null){
					currentCost = currentCost + (nearestStat2 - x);
					cost2 = currentCost;
				}
			}
			int finalAns = Math.min(cost1, cost2);
			System.out.println(finalAns);
		}
		br.close();
	}
}
