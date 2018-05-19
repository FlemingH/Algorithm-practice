import java.util.Scanner;

public class Test12_最大公约数 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		String[] split = str.split("\\s+");

		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		
		int yushu = 1;
		
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		
		int jiegou;
		
		do {
			yushu = max%min;
			if(yushu != 0){
				max = min;
				min = yushu;
				continue;
			} else {
				jiegou = min;
				break;
			}
		} while (true);
		
		System.out.println(jiegou);
		
	}

}
