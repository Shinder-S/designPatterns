package dessignPattern;

public class main {

	public static void main(String[] args) {
		
		ItemFactory itemFactory = ItemFactory.getInstance();
		
		Shop shop = new Shop();
		
		shop.addItem(itemFactory.createItem(1));
		shop.addItem(itemFactory.createItem(2));
		shop.addItem(itemFactory.createItem(3));
		
		System.out.println("Total price is: " + shop.calculatePrice());
	}

}
