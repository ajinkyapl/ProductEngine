package cart;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CartTest {

	@Test
	public void test1() throws Exception {
		Cart cart = new Cart(3);
		cart.addItems(new Item("A"));
		cart.addItems(new Item("B"));
		cart.addItems(new Item("C"));
		assertEquals("Test1 Success", 100, cart.getTotalPrice(cart));
	}
	
	@Test
	public void test2()  throws Exception {
		Cart cart = new Cart(11);
		for (int i = 0; i < 5; i++)cart.addItems(new Item("A"));
		for (int i = 0; i < 5; i++)cart.addItems(new Item("B"));
		cart.addItems(new Item("C"));
		assertEquals("Test2 Success", 370, cart.getTotalPrice(cart));
	}
	
	@Test
	public void test3()  throws Exception {
		Cart cart = new Cart(10);
		for (int i = 0; i < 3; i++)cart.addItems(new Item("A"));
		for (int i = 0; i < 5; i++)cart.addItems(new Item("B"));
		cart.addItems(new Item("C"));
		cart.addItems(new Item("D"));
		assertEquals("Test3 Success", 280, cart.getTotalPrice(cart));
	}
	
	@Test
	public void test4() {
		try {
			Cart cart = new Cart(3);
			cart.addItems(new Item("E"));
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
}
