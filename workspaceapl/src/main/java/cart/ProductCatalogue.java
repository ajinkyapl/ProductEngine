package cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductCatalogue {

	static public HashMap<String, Integer> itemCostMap = new HashMap<>();

	static public List<Promotion> promoList = new ArrayList<>();

	static {
		itemCostMap.put("A", 50);
		itemCostMap.put("B", 30);
		itemCostMap.put("C", 20);
		itemCostMap.put("D", 15);

		HashMap<String, Integer> rule1 = new HashMap<>();
		rule1.put("A", 3);

		HashMap<String, Integer> rule2 = new HashMap<>();
		rule2.put("B", 2);

		HashMap<String, Integer> rule3 = new HashMap<>();
		rule3.put("C", 1);
		rule3.put("D", 1);


		promoList.add(new Promotion(130, rule1));
		promoList.add(new Promotion(45, rule2));
		promoList.add(new Promotion(30, rule3));
	}

}
