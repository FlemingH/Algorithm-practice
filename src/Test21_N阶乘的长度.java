import java.util.Scanner;


public class Test21_N½×³ËµÄ³¤¶È {

	static double e=2.718281828459;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();

		long len=(long)(Math.log10(Math.sqrt(2*Math.PI*n))+n*Math.log10(n/e)+1);
		
		System.out.println(len);
		
		scanner.close();
	}


}
