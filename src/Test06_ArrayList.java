import java.util.ArrayList;


public class Test06_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i)+" ");
		}
		
		System.out.println();
		
		for (int i = intList.size()-1; i >= 0; i--) {
			System.out.print(intList.get(i)+" ");
		}
		
		System.out.println();
		
		for (Integer integer : intList) {
			System.out.print(integer+" ");
		}
		
		System.out.println();
		
		for (int i = intList.size()-1; i >= 0 ; i--) {
			intList.remove(i);
			if (intList.size() == 0) {
				break;
			} else {
				for (Integer integer : intList) {
					System.out.print(integer+" ");
				}
				System.out.println();
			}
		}

		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		for (Integer integer : intList) {
			System.out.print(integer+" ");
		}
		
		System.out.println();
		
		intList.set(2, 1);
		intList.set(1, 2);
		intList.set(0, 3);
		
		for (Integer integer : intList) {
			System.out.print(integer+ " ");
		}
		
	}

}
