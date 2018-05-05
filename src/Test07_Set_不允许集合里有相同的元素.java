import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;


public class Test07_Set_不允许集合里有相同的元素 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Collection分为	
		
		//有序可重复：		List		使用同List
		
		//队列：			Queue		contains(Object o)
		//							如果此 collection 包含指定的元素，则返回 true。
		//无序不可重复：	Set			
		
		Collection<Integer> intCollectionList = new ArrayList<Integer>();	
		//List有序可重复
			
		Collection<Integer> intCollectionSet = new HashSet<Integer>();		
		//Set无序不可重复

		//Map
		
		HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < 3; i++) {
			Integer put = intMap.put(i, i);		//写入成功返回null
			if (put == null) {
				System.out.println("写入成功");
			}
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(intMap.get(i));
		}
		
	}

}
