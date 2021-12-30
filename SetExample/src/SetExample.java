import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(7);
		set.add(3);
		set.add(9);
		set.add(5);
		set.add(4);
		set.add(2);
		set.add(1);
		set.add(6);
		set.add(5);

		System.out.println(set);
		
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(1);
		set1.add(7);
		set1.add(3);
		set1.add(9);
		set1.add(5);
		set1.add(4);
		set1.add(2);
		set1.add(1);
		set1.add(6);
		set1.add(5);

		System.out.println(set1);

		Set<Integer> set2 = new TreeSet<>();
		set2.add(1);
		set2.add(7);
		set2.add(3);
		set2.add(9);
		set2.add(5);
		set2.add(4);
		set2.add(2);
		set2.add(1);
		set2.add(6);
		set2.add(5);

		System.out.println(set2);
	}
}
