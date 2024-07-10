package compositePattern;

public class main {

	public static void main(String[] args) {
		
		ProductSimple hamburger = new ProductSimple("Hamburger", 50.0);
		ProductSimple fernchFries = new ProductSimple("French Fries", 10.0);
		ProductSimple iceCream = new ProductSimple("Ice Cream", 15.0);
		ProductSimple coffe = new ProductSimple("Coffe", 5.0);
		ProductSimple cola = new ProductSimple("Cola", 10.0);
		
		
		BurgerJoint burgerJoint = new BurgerJoint();
		
		burgerJoint.addProduct(hamburger);
		burgerJoint.addProduct(cola);
		burgerJoint.addProduct(fernchFries);
		
		System.out.println("Your ticket is: " + burgerJoint.calculateCartPrice());
		
		ProductComposite combo = new ProductComposite("Combo 1", 0.2);
		combo.addProduct(hamburger);
		combo.addProduct(cola);
		combo.addProduct(fernchFries);
		
		System.out.println("Your ticket with your discount is: " + combo.calculatePrice());

	}

}
