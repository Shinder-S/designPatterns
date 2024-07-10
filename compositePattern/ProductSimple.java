package compositePattern;

public class ProductSimple extends Product{

	private Double price;

	public ProductSimple(String name, Double price) {
		super(name);
		this.price = price;
	}

	@Override
	public Double calculatePrice() {
		return price;
	}
	
	
}
