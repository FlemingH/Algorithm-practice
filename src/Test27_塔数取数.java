import java.util.Scanner;


public class Test27_ËþÊýÈ¡Êý {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();

		long max = 0;
		String temp;
		int index = 0;
		
		temp = scanner.nextLine();
		max = max + Integer.parseInt(temp);
		
		for (int i = 1; i < Integer.parseInt(n); i++) {
			temp = scanner.nextLine();
			String[] rs = zuiDa(temp, index).split("\\s+");
			max = max + Integer.parseInt(rs[0]);
			index = Integer.parseInt(rs[1]);
		}
		
		System.out.println(max);
		
		scanner.close();
	}

	private static String zuiDa(String temp, int index) {

		String[] split = temp.split("\\s+");
		int a = Integer.parseInt(split[index]);
		int b = Integer.parseInt(split[index+1]);
		int max = (a > b ? a : b);
		index = (a > b ? index : index+1);
		
		return max + " " + index;
	}
	
}
