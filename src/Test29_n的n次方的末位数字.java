import java.util.Scanner;


public class Test29_n��n�η���ĩλ���� {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		a = scanner.nextInt();
		b = a % 10;
	    
		//�ݵ�ĩβ���ֹ���Ϊ4��һѭ��
	    c = a % 4;
	    
	    //c����0ʱΪ���ĸ�
	    if (c == 0) {
	    	c = 4;
	    }

	    c = (int) Math.pow(b, c);

	    System.out.println(c%10);
	    
	    scanner.close();
	    
	}

}
