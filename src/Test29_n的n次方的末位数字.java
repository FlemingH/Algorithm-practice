import java.util.Scanner;


public class Test29_n的n次方的末位数字 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		a = scanner.nextInt();
		b = a % 10;
	    
		//幂的末尾数字规律为4个一循环
	    c = a % 4;
	    
	    //c等于0时为第四个
	    if (c == 0) {
	    	c = 4;
	    }

	    c = (int) Math.pow(b, c);

	    System.out.println(c%10);
	    
	    scanner.close();
	    
	}

}
