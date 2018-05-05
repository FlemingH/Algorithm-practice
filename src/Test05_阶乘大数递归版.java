import java.math.BigInteger;
import java.util.Scanner;


public class Test05_�׳˴����ݹ�� {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		BigInteger big = f(num);
		
		System.out.println(big);
		
	}

	private static BigInteger f(int num) {
		
		BigInteger zero = BigInteger.valueOf(0);
		BigInteger big = BigInteger.valueOf(num);

		if (num == 0) {
			return zero;
		} else if (num == 1) {
			return big;
		} else {
			return big.multiply(f(num-1));
		}
	
	}

}
