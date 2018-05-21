import java.util.Scanner;


public class Test19_最大连续字段和 {

	public static int[] input;
	public static long[] dp;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		input = new int[n];
		dp = new long[n];
		
		for (int i = 0; i < n; i++) {
			input[i] = scanner.nextInt();
		}
		
		dp[0] = Math.max(0, input[0]);
		
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i-1]+input[i], 0);
		}
		
		long ans = 0;
		
		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, dp[i]);
		}
		
		System.out.println(ans);
		
		scanner.close();
		
	}

}
