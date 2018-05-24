import java.util.Arrays;
import java.util.Scanner;


public class Test35_三个数和为0 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		Arrays.sort(a);
		
		boolean flag=true;
		
		for (int i = 0; i < a.length; ++i) {
			for (int j = i+1; j < a.length; ++j) {
				if(a[i] + a[j] <= 0) {
					for (int k = j+1; k < a.length; ++k) {
						if(a[i] + a[j] + a[k] == 0){
							System.out.println(a[i] + " " + a[j] + " " + a[k]);
							flag = false;
						}
					}
				}
			}
		}
		
		if(flag) {
			System.out.println("No Solution");
		}
		
		scanner.close();
		
	}

}
