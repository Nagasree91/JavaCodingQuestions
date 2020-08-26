package javacoding.hashtags;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeMap;

public class HashTags {

	public static void main(String[] args) {
		String input = "Why You Will Probably Pay More for Your Christmas Tree This Year";
		String[] words = input.split("\\s");
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(Comparator.reverseOrder());
		for (String word : words) {
			if (!treeMap.containsKey(word.length()))
				treeMap.put(word.length(), word);
		}
		Collection<String> values = treeMap.values();
		values.stream().limit(3).forEach(System.out::println);
	}

}
