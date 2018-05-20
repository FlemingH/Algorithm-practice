import java.util.Arrays;
import java.util.Scanner;


public class Test15_≈≈–Ú {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		Arrays.sort(a);
		
		for (int i : a) {
			System.out.println(i);
		}
		
	}
	
}
