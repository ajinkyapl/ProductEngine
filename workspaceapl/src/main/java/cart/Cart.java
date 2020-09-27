package cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

	private List<Item> items;
	
	//Final cart count.
	private int amount = 0;

	// Map for count of products added in cart.
	private Map<String, Integer> itemCount = new HashMap<>();

	public Cart(int i) {
		items = new ArrayList<>(i);
		itemCount.put("A", 0);
		itemCount.put("B", 0);
		itemCount.put("C", 0);
		itemCount.put("D", 0);

	}

	public List<Item> getItems() {
		return items;
	}

	public void addItems(Item item) {
		this.items.add(item);
	}

	public int getAmount() {
		return amount;
	}

	public void addAmount(int amount) {
		this.amount = this.amount + amount;
	}

	// Function to get cart object and calculates total cost of products in cart.
	public int getTotalPrice(Cart cart) {
		
		//code to get count of products by type and set in itemCount
		cart.getItems().forEach(item -> itemCount.put(item.getId(), itemCount.get(item.getId()) + 1));
		
		//Rule1 and rule2 added
		cart.addAmount(
				(itemCount.get("A") / 3) * 130 + (itemCount.get("A") % 3 * ProductCatalogue.itemCostMap.get("A")));
		cart.addAmount(
				(itemCount.get("B") / 2) * 45 + (itemCount.get("B") % 2 * ProductCatalogue.itemCostMap.get("B")));

		//Rule 3 to check 2 products and if they persent, then apply rule
		if (itemCount.get("C") > 0 && itemCount.get("D") > 0)
			if (itemCount.get("C") > itemCount.get("D")) {
				cart.addAmount(itemCount.get("D") * 30);
				cart.addAmount((itemCount.get("C") - itemCount.get("D")) * ProductCatalogue.itemCostMap.get("C"));
			} else {
				cart.addAmount(itemCount.get("C") * 30);
				cart.addAmount((itemCount.get("D") - itemCount.get("C")) * ProductCatalogue.itemCostMap.get("D"));
			}
		else
			cart.addAmount(itemCount.get("C") * ProductCatalogue.itemCostMap.get("C")
					+ itemCount.get("D") * ProductCatalogue.itemCostMap.get("D"));
		
		return cart.getAmount();
		
	}

	

}
