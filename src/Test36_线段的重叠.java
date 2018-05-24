import java.util.Scanner;


public class Test36_Ïß¶ÎµÄÖØµş {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();

		int[] start = new int[Integer.parseInt(n)];
		int[] end = new int[Integer.parseInt(n)];
		
		for (int i = 0; i < start.length; i++) {
			String str = scanner.nextLine();
			String[] split = str.split("\\s+");
			start[i] = Integer.parseInt(split[0]);
			end[i] = Integer.parseInt(split[1]);
		}
		
		scanner.close();
	}

}
