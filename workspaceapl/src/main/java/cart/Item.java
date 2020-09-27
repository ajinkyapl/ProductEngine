package cart;

public class Item {

	private String id;
	private int cost;

	public Item(String id) throws Exception {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public int getCost() {
		return cost;
	}
}
