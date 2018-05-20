import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test14_数组中和等于K的数对 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		String[] split = str.split("\\s+");

		int k = Integer.parseInt(split[0]);
    	int n = Integer.parseInt(split[1]);
	
    	int a[] = new int[n];
    	
    	for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
    	
    	List<Integer> list = new ArrayList<Integer>();			//存放键值的list
    	
    	Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();		//存放数对
    	
    	for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+a[j] == k) {
					list.add(Math.min(a[i], a[j]));
					hashMap.put(Math.min(a[i], a[j]), Math.max(a[i], a[j]));
				}
			}
		}
    	
    	if (!list.isEmpty()) {
  
    		Collections.sort(list);
        	
    		for (int i = 0; i < list.size(); i++) {
        		int key = list.get(i);
    			System.out.println(key + " " + hashMap.get(key));
    		
        	}
    		
    	} else {
    		System.out.println("No Solution");
		}
	}

}
