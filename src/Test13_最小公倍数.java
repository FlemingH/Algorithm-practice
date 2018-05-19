import java.util.Scanner;

public class Test13_最小公倍数 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		String[] split = str.split("\\s+");

		int a = Integer.parseInt(split[0]);
    	int b = Integer.parseInt(split[1]);
    	int c;
    	int num1 = a;
    	int num2 = b;
    	if (a<b){
    		c = a;
    		a = b;
    		b = c;
    	}
    	while((a=a%b)!=0){
    		int temp = a;
    		a = b;
    		b= temp;
    	}
    	long d = ((long)num1*num2)/b;
    	System.out.print(d);
	
	}

}
