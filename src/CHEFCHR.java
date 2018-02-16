import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;



/**
 * @author Ketan Mehta
 * @date 
 * @problem_link https://www.codechef.com/FEB18/problems/CHEFCHR
 */ 
class CHEFCHR {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String input = br.readLine().trim();
			char[] arr = input.toCharArray();
			long answer = 0;
			for(int x=0; x<arr.length - 3; x++){
				if(valid(arr[x],arr[x+1],arr[x+2],arr[x+3])){
					++answer;
				}
			}
			if(answer != 0){
				System.out.println("lovely " + answer);
			}
			else{
				System.out.println("normal");
			}
		}
		br.close();
	}
	
	public static boolean valid(char c, char h, char e, char f){
		if(c != 'c' && c !='h' && c != 'e' && c!= 'f'){
			return false;
		}
		if(h != 'c' && h !='h' && h != 'e' && h!= 'f'){
			return false;
		}
		if(e != 'c' && e !='h' && e != 'e' && e!= 'f'){
			return false;
		}
		if(f != 'c' && f !='h' && f != 'e' && f!= 'f'){
			return false;
		}
		TreeSet<Character> set = new TreeSet<Character>();
		set.add(c);
		set.add(h);
		set.add(e);
		set.add(f);
		return ((int)c+h+e+f) == 406 && set.size() == 4;
	}
}
