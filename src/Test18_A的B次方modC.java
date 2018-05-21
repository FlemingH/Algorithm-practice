import java.util.Scanner;


public class Test18_AµÄB´Î·½modC {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		String[] split = str.split("\\s+");

		long a = Long.parseLong(split[0]);
		long b = Long.parseLong(split[1]);
		long c = Long.parseLong(split[2]);
		
		int ans = fun(a, b, c);
		
		System.out.println(ans);
		
	}
	
	public static int fun(long a,long b,long c)
	{
		int ans=1;
		
		while(b>0)
		{
			if(b%2==1)
			{
				ans=(int) ((ans*a)%c);
				
			}
			b=b/2;
			a=a*a%c;
			
		}
		return ans;
	}
	
}
