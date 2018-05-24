import java.util.Scanner;


public class Test32_”Î7Œﬁπÿ {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}

		int[] result = yu7wuguan(a);
		
		for (int i : result) {
			System.out.println(i);
		}
		
		scanner.close();
	}

	private static int[] yu7wuguan(int[] a) {

		int[] result = new int[a.length];
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum = (a[i]*(a[i]+1)*(2*a[i]+1))/6;
			
			for (int j = 0; j <= a[i]; j++) {
				if ((j+"").contains("7") || j%7 == 0) {
					sum = sum - j*j;
				}
			}
			result[i] = sum;
		}
		
		return result;
	}

}
