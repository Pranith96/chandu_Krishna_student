package Synchronization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TwitterCode {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int topTrending = sc.nextInt();
		Pattern pattern = Pattern.compile("(#\\w+)");
		Matcher matcher;

		Map<String, Integer> counter = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < topTrending; i++) {
			String lines = sc.nextLine();
			matcher = pattern.matcher(lines);

			while (matcher.find()) {
				if (null != counter.get(matcher.group())) {
					counter.put(matcher.group(), (counter.get(matcher.group()) + 1));
				} else {
					counter.put(matcher.group(), new Integer(1));
				}
			}
		}
		List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(counter.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				if (b.getValue().equals(a.getValue()))
					return a.getKey().compareTo(b.getKey());
				else
					return b.getValue().compareTo(a.getValue());
			}
		});
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		Iterator it = sortedMap.entrySet().iterator();
		int counterTemp = 1;
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey());
			it.remove();
			if (counterTemp == 10) {
				break;
			}
			counterTemp++;
		}

		sc.close();
	}
}
