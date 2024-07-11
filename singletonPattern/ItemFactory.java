package singletonPattern;

public class ItemFactory {

	private static ItemFactory instance;
	
	private ItemFactory() {
		
	}
	
	public static ItemFactory getInstance() {
		if(instance == null) {
			instance = new ItemFactory();
		}
		
		return instance;
	}
	
	public Item createItem(Integer id) {
		switch(id){
		case(1):
			return new Item("Hamburger", 11.0);
		case(2):
			return new Item("French Fries", 7.0);
		case(3):
			return new Item("Ice cream", 5.0);
		}
		return null;
	}
}
