import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test31_数分解成两个数的平方和 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		List<String> list = fun(n);
		
		if(list.size() != 0){
			for (String string : list) {
				System.out.println(string);
			}
		} else {
			System.out.println("No Solution");
		}

		scanner.close();
		
	}

	private static List<String> fun(int n) {

		ArrayList<String> list = new ArrayList<String>();

		double m = Math.sqrt(n+0.5);
		for (int i = 0; i < m; i++) {
			
			int j = (int) Math.sqrt(n-i*i);  	
	
			if(i*i + j*j == n && j>=i){
					list.add(i + " " + j);
			}			

		}
		
		return list;
	}

}
