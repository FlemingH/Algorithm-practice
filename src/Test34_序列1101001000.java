import java.util.Scanner;


public class Test34_����1101001000 {

	public static void main(String[] args) {

		//�����Ȳ����е�ͨ�ʽ��
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		int[] r = f(a);
		
		for (int i : r) {
			System.out.println(i);
		}
		
		scanner.close();
	}

	private static int[] f(int[] a) {

		int[] r = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			r[i] = panduan(a[i]);
		}
		
		return r;
	}

	private static int panduan(int i) {
		
		for (int j = 1; ; j++) {
			if(j*(j-1) == 2*(i-1)){
				return 1;
			}
			if(j*(j-1) > 2*(i-1)){
				return 0;
			}
		}
		
	}

}
