package cart;

import java.util.HashMap;

public class Promotion {

	private int promoPrice;
	private HashMap<String, Integer> rule = new HashMap<>();

	public Promotion(int promoPrice, HashMap<String, Integer> rule) {
		this.promoPrice = promoPrice;
		this.rule = rule;
	}

	public int getPromoPrice() {
		return promoPrice;
	}

	public void setPromoPrice(int promoPrice) {
		this.promoPrice = promoPrice;
	}

	public HashMap<String, Integer> getRule() {
		return rule;
	}

	public void setRule(HashMap<String, Integer> rule) {
		this.rule = rule;
	}

}
