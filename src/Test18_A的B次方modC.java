import java.math.BigInteger;
import java.util.Scanner;


public class Test18_AµÄB´Î·½modC {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		String[] split = str.split("\\s+");

		BigInteger a = new BigInteger(split[0]);
		BigInteger b = new BigInteger(split[1]);
		BigInteger c = new BigInteger(split[2]);
		
		System.out.println(kuaisumi(a, b).mod(c));

	}

	private static BigInteger kuaisumi(BigInteger a, BigInteger b) {

		if(b.equals(new BigInteger("1"))) return a;
		BigInteger temp = kuaisumi(a, b.divide(new BigInteger("2")));

		if(b.mod(new BigInteger("2")).equals(new BigInteger("0"))){
			return temp.multiply(temp);
		} else {
			return a.multiply(temp).multiply(temp);
		}
		
	}
	
}
