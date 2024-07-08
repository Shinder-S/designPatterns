package statePattern;

public class main {

	public static void main(String[] args) {
		
		Tamagochi tamagochi = new Tamagochi("Thiago");
		
		System.out.println(tamagochi.getCurrentState());
		
		tamagochi.eat();
		
		System.out.println(tamagochi.getCurrentState());
		
		tamagochi.sleep();
		
		System.out.println(tamagochi.getCurrentState());
		
	}

}
