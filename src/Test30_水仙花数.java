import java.util.Scanner;

public class Test30_ˮ�ɻ��� {

	public static void main(String[] args) {

		//ˮ�ɻ�����ָһ�� n λ�� ( n >= 3 )��
		//����ÿ��λ�ϵ����ֵ� n ����֮�͵��������������磺1^3 + 5^3 + 3^3 = 153��
		
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
