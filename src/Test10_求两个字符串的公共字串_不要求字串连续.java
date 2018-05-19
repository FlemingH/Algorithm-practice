import java.util.Scanner;

public class Test10_求两个字符串的公共字串_不要求字串连续 {
	
	//动态规划求最大公共子序列
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();
		
		Object[] s1 = new Object[str1.length()];
		Object[] s2 = new Object[str2.length()];
		
		for (int i = 0; i < str1.length(); i++) {
			s1[i] = str1.charAt(i);
		}
		
		for (int i = 0; i < str2.length(); i++) {
			s2[i] = str2.charAt(i);
		}
		
		printLcs(lcsLength(s1, s2), s1, s2, s1.length, s2.length);
		
	}

	private static void printLcs(int[][] c, Object[] x, Object[] y, int i, int j) {

		if(i == 0 || j ==0){
			return ;
		}
		if(x[i-1].equals(y[j-1])){
			printLcs(c, x, y, i-1, j-1);
			System.out.print(x[i-1]);
		} else if (c[i-1][j] >= c[i][j-1]) {
			printLcs(c, x, y, i-1, j);
		} else {
			printLcs(c, x, y, i, j-1);
		}
		
	}

	private static int[][] lcsLength(Object[] x, Object[] y) {

		int m = x.length;
		int n = y.length;
		int[][] c = new int[m+1][n+1];
		
		int i;
		int j;
		for (i = 0; i <= m; i++) {
			c[i][0] = 0;
		}
		for (j = 0; j <= n; j++) {
			c[0][j] = 0;
		}
		
		for (i = 1; i <= m; i++) {
			
			for (j = 1; j <= n; j++) {
			
				if (x[i-1].equals(y[j-1])) {
					c[i][j] = c[i-1][j-1] + 1;
				} else if (c[i-1][j] >= c[i][j-1]) {
					c[i][j] = c[i-1][j];
				} else {
					c[i][j] = c[i][j-1];
				}

			}
			
		}
		
		return c;
	}
	
}