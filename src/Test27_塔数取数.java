import java.util.Scanner;


public class Test27_ËşÊıÈ¡Êı {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();

		int max = 0;
		String temp;
		int index = 0;
		
		for (int i = 0; i < Integer.parseInt(n); i++) {
			temp = scanner.nextLine();
			String[] rs = zuiDa(temp, index, i).split("\\s+");
			max = max + Integer.parseInt(rs[0]);
			index = Integer.parseInt(rs[1]);
		}
		
		System.out.println(max);
		
		scanner.close();
	}

	private static String zuiDa(String temp, int index, int i) {

		if(i==0){
			return Integer.parseInt(temp) + " " + index;
		} else {
			String[] split = temp.split("\\s+");
			int a = Integer.parseInt(split[index]);
			int b = Integer.parseInt(split[index+1]);
			int max = (a >= b ? a : b);
			index = (a >= b ? index : index+1);
			
			return max + " " + index; 
		}
		
	}
	
}
