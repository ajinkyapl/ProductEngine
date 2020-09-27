package cart;

public class Item {

	private String id;
	private int cost;

	public Item(String id) throws Exception {
		this.id = id;
		
		// Check if id provided by user is valid (Product name is present or not)
		if (ProductCatalogue.itemCostMap.containsKey(id))
			this.cost = ProductCatalogue.itemCostMap.get(id);
		else
			throw new Exception("Product not found");
	}

	public String getId() {
		return id;
	}

	public int getCost() {
		return cost;
	}
}
