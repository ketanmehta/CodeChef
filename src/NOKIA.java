import java.util.Scanner;

/**
 * @author Ketan Mehta
 * @date
 * @problem_link https://www.codechef.com/problems/NOKIA
 */
class NOKIA {
	static int[] min = new int[100];
	static int[] max = new int[100];

	public static void main(String args[]) {
		int t, n, m;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		max[0] = 0;
		max[1] = 2;
		for (int i = 2; i < 100; i++) {
			max[i] = max[i - 1] + i + 1;
		}
		while ((t--) > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			min[n] = calculateMin(n);
			if (m < min[n]) {
				System.out.println(-1);
			} else if (m >= min[n] && m <= max[n]) {
				System.out.println(0);
			} else {
				System.out.println(m - max[n]);
			}
		}
		sc.close();
	}

	public static int calculateMin(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 2;
		}
		if (n % 2 != 0) {
			return (2*(calculateMin(n/2))) + n + 1;
		}
		return calculateMin(n/2) + calculateMin(n/2-1) + n + 1;
	}
}
