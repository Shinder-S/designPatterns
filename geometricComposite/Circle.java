package geometricComposite;

public class Circle implements GeometricFigure{

	private Double radio;

	public Circle(Double radio) {
		this.radio = radio;
	}

	@Override
	public Double calculateArea() {
		return Math.PI * radio * radio;
	}
	
	
}
