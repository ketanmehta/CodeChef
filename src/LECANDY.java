import java.util.Scanner;


public class LECANDY {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
			int N = sc.nextInt();
			int C = sc.nextInt();
			long sum = 0;
			for(int x=0; x<N; x++){
				sum += sc.nextLong();
			}
			System.out.println( C >= sum ? "Yes" : "No");
		}
		sc.close();
	}
}