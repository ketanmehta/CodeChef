
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Ketan Mehta
 * @date 
 * @problem_link 
 */

public class CHEFSOCK {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		long jacketCost,sockCost,money;
		jacketCost = sc.nextLong();
		sockCost = sc.nextLong();
		money = sc.nextLong();
		long balance = money - jacketCost;
		long socks = balance / sockCost;
		System.out.println(socks % 2 == 0 ? "Lucky Chef" : "Unlucky Chef");
		br.close();
		sc.close();
	}
}
