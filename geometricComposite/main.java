package geometricComposite;

public class main {

	public static void main(String[] args) {
		
		CompleteObject completeObject = new CompleteObject();
		
		completeObject.addGeometricFigure("Circle");
		completeObject.addGeometricFigure("Rectangle");
		completeObject.addGeometricFigure("Square");
		completeObject.addGeometricFigure("Triangle");
		
		System.out.println(completeObject.calculateTotalArea());
	}

}
