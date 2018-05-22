import java.util.Scanner;


public class Test28_阶乘后面有几个0 {

	public static void main(String[] args) {

		//一个数 n 的阶乘末尾有多少个 0 取决于从 1 到 n 的各个数的因子中 2 和 5 的个数, 
		//而 2 的个数是远远多余 5 的个数的, 因此求出 5 的个数即可

		Scanner scanner = new Scanner(System.in);
		int n;  
		int sum = 0;
		
		n = scanner.nextInt();
		
		while (n>=5) {
			sum=sum+n/5;
			n/=5;
		}  

		System.out.println(sum);
		
		scanner.close();
	}		

}
