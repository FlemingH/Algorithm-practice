import java.util.Scanner;


public class Test28_�׳˺����м���0 {

	public static void main(String[] args) {

		//һ���� n �Ľ׳�ĩβ�ж��ٸ� 0 ȡ���ڴ� 1 �� n �ĸ������������� 2 �� 5 �ĸ���, 
		//�� 2 �ĸ�����ԶԶ���� 5 �ĸ�����, ������ 5 �ĸ�������

		Scanner scanner = new Scanner(System.in);
		int n;  
		int sum = 0;
		
		n = scanner.nextInt();
		
		while (n>=5) {
			sum=sum+n/5;
			n/=5;
		}  

		System.out.println(sum);
		
		scanner.close();
	}		

}
