import java.math.BigInteger;
import java.util.Scanner;


public class Test04_阶乘大数不递归版 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);  
        int num=in.nextInt();  
        
        BigInteger big = f(num);
		
        System.out.println(big);
        
	}

	private static BigInteger f(int num) {

		BigInteger zero = BigInteger.valueOf(0);	//返回0
		BigInteger big = BigInteger.valueOf(1);		//返回1或结果
		
		if(num == 0){
			return zero;
		} else if (num == 1) {
			return big;
		} else {
			for(int i=1;i<=num;i++){  
	            big=big.multiply(BigInteger.valueOf(i));  
	        }
			return big;
		}
		
	}

}
