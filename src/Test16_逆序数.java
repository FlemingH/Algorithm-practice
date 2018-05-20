import java.util.Scanner;


public class Test16_逆序数 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		//在一个排列中，如果一对数的前后位置与大小顺序相反，
		//即前面的数大于后面的数，那么它们就称为一个逆序。一个排列中逆序的总数就称为这个排列的逆序数。
		
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
