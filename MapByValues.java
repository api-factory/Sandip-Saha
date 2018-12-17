package day1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapByValues {
	public static Map<String, Integer> sortByValue(final Map<String, Integer> wordCounts) {
		return wordCounts.entrySet().stream().sorted((Map.Entry.<String, Integer>comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
						LinkedHashMap::new));
    }
    public static void main(String[] args) {
        final Map<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("Sandip", 100);
        wordCounts.put("Moumita", 200);
        wordCounts.put("Awnika", 50);
        wordCounts.put("Subhrata", 70);
        wordCounts.put("Anukriti", 200);
        final Map<String, Integer> sortedByCount = sortByValue(wordCounts);
        System.out.println(sortedByCount);
    }
}
