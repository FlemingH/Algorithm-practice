import java.util.Scanner;

public class Test23_Nim”Œœ∑ {
	
	static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int x = in.nextInt();
		for(int i = 1; i < n; i++) {
			int y = in.nextInt();
			x ^= y;
		}
		if(x>0) System.out.println('A');
		else System.out.println('B');
		
		in.close();
 	}
}

