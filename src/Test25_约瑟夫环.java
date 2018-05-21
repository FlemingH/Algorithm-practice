import java.util.Scanner;


public class Test25_Ô¼Éª·ò»·{
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        juserfLoop(n,m);
        sc.close();
    }
	private static void juserfLoop(int n,int m){
		
		int res = 0;
	
		for (int i=2;i<=n;i++){
	    	res=(res+m)%i;
	    }
	    
	    System.out.println(res+1);
	
	}
}