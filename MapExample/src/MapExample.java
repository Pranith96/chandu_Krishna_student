import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");

		System.out.println(map);
		System.out.println(map.get(4));

		for (Map.Entry<Integer, String> data : map.entrySet()) {
			System.out.println(data.getKey() + " " + data.getValue());
		}

		Map<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(1, "A");
		map1.put(4, "B");
		map1.put(2, "C");
		map1.put(6, "D");
		map1.put(3, "E");

		System.out.println(map1);

		Map<Integer, String> map2 = new TreeMap<>();
		map2.put(1, "A");
		map2.put(4, "B");
		map2.put(2, "C");
		map2.put(6, "D");
		map2.put(3, "E");

		System.out.println(map2);

		ConcurrentMap<Integer, String> map3 = new ConcurrentHashMap<>();
		map3.put(1, "A");
		map3.put(4, "B");
		map3.put(2, "C");
		map3.put(6, "D");
		map3.put(3, "E");
		System.out.println(map3);
	}
}
