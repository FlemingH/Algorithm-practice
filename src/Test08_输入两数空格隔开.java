import java.util.Scanner;

public class Test08_���������ո���� {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] split = str.split("\\s+");
		
		int i = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
		
		System.out.println(i);
		
	}

}
