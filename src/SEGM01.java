
import java.util.Scanner;

/**
 * @author Ketan Mehta
 * @date 
 * @problem_link 
 */

public class SEGM01 {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			String s = sc.next();
			int start = s.indexOf("1");
			
			if(start != -1){
				s = s.substring(start);
			}
			else{
				System.out.println("NO");
				continue;
			}
			boolean zerofound = false;
			boolean valid = true;
			for(int j=start; j<s.length(); j++){
				if(s.charAt(j) == '0'){
					zerofound = true;
				}
				if(s.charAt(j) == '1' && zerofound){
					valid = false;
					break;
				}
			}
			System.out.println(valid ? "YES" : "NO");
		}
		sc.close();
	}
}
