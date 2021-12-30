import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExamples {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(4);
		System.out.println(list);
		System.out.println(list.get(3));
		
		//List<Integer> listAll = new ArrayList<>(list);
		//listAll.addAll(list);
		
		//List<Integer> listdata = Arrays.asList(1,2,3,4,5,6);
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		List<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		System.out.println(list1);
	
		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		System.out.println(vector);

	}

}
