package cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

	private List<Item> items;
	private int amount = 0;

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

	public int getTotalPrice(Cart cart) {
		
		return cart.getAmount();
	}

	

}
