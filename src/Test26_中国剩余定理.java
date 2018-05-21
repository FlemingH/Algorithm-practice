import java.util.Scanner;

public class Test26_中国剩余定理{
    static long x ;
    static long y;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        //inout
        for(int i=0; i<n; ++i){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        //process
        long result = china(a,b,n);
        //output 
        System.out.println(result);
        sc.close();
    }
    public static long china(int[] a, int[] b, int n){
        long total=1, m = 0;
        long ans = 0;
        for(int i=0; i<n; ++i)
            total *= a[i];
        for(int i=0; i<n; ++i){
            m = total / a[i];
            extgcd(a[i], m, x, y);
            ans = (ans + y*m*b[i]) % total;
        }
        return (ans + total) % total;
    }
    public static void extgcd(long a, long b, long a1, long b1){
        if(b==0){
            x = 1;
            y = 0;
        }else{
            extgcd(b, a%b ,x, y);
            long t = x;
            x = y;
            y = t - a/b*y;
        }
    }
}
