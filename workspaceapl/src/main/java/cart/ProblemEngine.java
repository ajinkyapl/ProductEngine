package cart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProblemEngine {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Total Products : ");
		int a = Integer.parseInt(br.readLine());
		Cart cart = new Cart(a);
		for (int i = 0; i < a; i++) {
			System.out.println("Product Type: (A,B,C or D)");
			cart.addItems(new Item(br.readLine().toUpperCase()));
		}

		System.out.println("Total Cart Amount: " + cart.getTotalPrice(cart));
	}

}
