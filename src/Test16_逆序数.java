import java.util.Scanner;


public class Test16_������ {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//��һ�������У����һ������ǰ��λ�����С˳���෴��
		//��ǰ��������ں����������ô���Ǿͳ�Ϊһ������һ������������������ͳ�Ϊ������е���������
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		int cout = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					cout++;
				}
			}
		}
		
		System.out.println(cout);
		
	}

}
