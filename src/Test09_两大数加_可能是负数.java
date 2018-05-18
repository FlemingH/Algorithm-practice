import java.math.BigInteger;
import java.util.Scanner;


public class Test09_两大数加_可能是负数 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		BigInteger big1 = scanner.nextBigInteger();
		BigInteger big2 = scanner.nextBigInteger();
		
		System.out.println(big1.add(big2));
		
		
	}
	
}
