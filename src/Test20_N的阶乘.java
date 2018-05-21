import java.math.BigInteger;
import java.util.Scanner;


public class Test20_NµÄ½×³Ë {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		BigInteger big = scanner.nextBigInteger();
		
		BigInteger jiechen = jiechen(big);
		
		System.out.println(jiechen);
		
		scanner.close();
		
	}

	private static BigInteger jiechen(BigInteger big) {

		BigInteger zero = BigInteger.ZERO;
		BigInteger one = BigInteger.ONE;
		
		if(big.equals(zero)){
			return zero;
		} else if (big.equals(one)) {
			return one;
		} else {
			return big.multiply(jiechen(big.subtract(new BigInteger("1"))));
		}
		
	}

}
