import java.util.Scanner;

public class Test24_Íþ×ô·òÓÎÏ· {
	static Scanner in = new Scanner(System.in);
	public static void swap(int num[]){
		int temp;
		if(num[0] > num[1]){
			temp = num[1];
			num[1] = num[0];
			num[0] = temp;
		}
	}
	public static void main(String[] args) {
		int N = in.nextInt();
		for(int i=0; i < N; i++){
			int temp[] = new int[2];
			temp[0] = in.nextInt();
			temp[1] = in.nextInt();
			swap(temp);
			if(temp[0] == (int)((Math.sqrt(5) + 1)/2 * (temp[1] - temp[0]))){
				System.out.println("B");
			}else{
				System.out.println("A");
			}
		}
		in.close();
	}
}

