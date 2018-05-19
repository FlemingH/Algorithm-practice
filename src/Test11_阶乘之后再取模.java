import java.math.BigInteger;
import java.util.Scanner;

public class Test11_阶乘之后再取模 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//两个数N,P，中间用空格隔开。(N < 10000, P < 10^9)
		String str = scanner.nextLine();
		
		String[] split = str.split("\\s+");
		BigInteger n = new BigInteger(split[0], 10);
		BigInteger p = new BigInteger(split[1], 10); 
		
		BigInteger jiechen = f1(n);
		
		BigInteger qumo = f2(jiechen, p);
		
		System.out.println(qumo);
		
	}

	private static BigInteger f2(BigInteger jiechen, BigInteger p) {
		return jiechen.mod(p);		//阶乘的取模
	}

	private static BigInteger f1(BigInteger n) {

		if (n.equals(BigInteger.ZERO)) {	//阶乘的比较
			return BigInteger.ZERO;
		} else if (n.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		} else {
			return n.multiply(f1(n.subtract(BigInteger.ONE)));	//阶乘的减法和乘法
		}
		
	}

}
