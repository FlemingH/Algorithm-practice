import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;


public class Test07_Set_��������������ͬ��Ԫ�� {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Collection��Ϊ	
		
		//������ظ���		List		ʹ��ͬList
		
		//���У�			Queue		contains(Object o)
		//							����� collection ����ָ����Ԫ�أ��򷵻� true��
		//���򲻿��ظ���	Set			
		
		Collection<Integer> intCollectionList = new ArrayList<Integer>();	
		//List������ظ�
			
		Collection<Integer> intCollectionSet = new HashSet<Integer>();		
		//Set���򲻿��ظ�

		//Map
		
		HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < 3; i++) {
			Integer put = intMap.put(i, i);		//д��ɹ�����null
			if (put == null) {
				System.out.println("д��ɹ�");
			}
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(intMap.get(i));
		}
		
	}

}
