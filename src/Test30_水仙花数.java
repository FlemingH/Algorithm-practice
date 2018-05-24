import java.util.Scanner;

public class Test30_水仙花数 {

	public static void main(String[] args) {

		//水仙花数是指一个 n 位数 ( n >= 3 )，
		//它的每个位上的数字的 n 次幂之和等于它本身。（例如：1^3 + 5^3 + 3^3 = 153）
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		while (true) {
			if(isShuiXianhua(n) == true){
				break;
 			} else {
				n++;
			}
		}
		
		System.out.println(n);
		
		scanner.close();
		
	}

	 private static boolean isShuiXianhua(int n){
		 int[] number = {153,370,371,407,1634,8208,9474,54748,92727,93084,548834};
	        for(int i = 0;i<number.length;i++){
	        	if(number[i] == n){
	                return true;
	            }
	        }
	     return false;
	 }
	
}
