import java.util.Scanner;


public class Test22_BashÎÊÌâ {

	static Scanner scanner = new Scanner(System.in);
	static int t;
	
	public static void main(String[] args) {

		t = scanner.nextInt();
		long n,k;
		
		while (t-- > 0) {
			n = scanner.nextLong(); k = scanner.nextLong();
			
			if(n%(k+1) == 0){
				System.out.println("B");
			} else {
				System.out.println("A");
			}
			 
		}
		
		scanner.close();
		
	}

}
