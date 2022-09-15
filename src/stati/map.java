package stati;

import java.util.LinkedHashMap;
import java.util.Map;

public class map {
	
	

	public static void main(String[] args) {
		int[] a = { 3, 2, 1, 3, 3, 5, 4, 2, 2, 3 };

		Map<Integer, Integer> numMap = new LinkedHashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (!numMap.containsKey(a[i])) {
				numMap.put(a[i], 1);
			} else {
				int count = numMap.get(a[i]);
				numMap.put(a[i], count + 1);
			}
		}
		
		// step 1
		System.out.println("** step 1 ***");
		for (Map.Entry<Integer, Integer> e : numMap.entrySet()) {
			System.out.println(e);
		}

		// step 2
		System.out.println("** step 2 ***");
		for (Map.Entry<Integer, Integer> ent : numMap.entrySet()) {
			for (int i = 0; i < ent.getValue(); i++) {
				System.out.print(ent.getKey());
			}
		}
	}
}
