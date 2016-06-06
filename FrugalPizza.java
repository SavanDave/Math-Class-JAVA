import java.util.Scanner;

public class FrugalPizza {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the diameter of Pizza A");
		double diameterPizzaA = keyboard.nextDouble();
		System.out.println("Enter the price of Pizza A");
		double pricePizzaA = keyboard.nextDouble();

		System.out.println("Enter the radius of Pizza B");
		double diameterPizzaB = keyboard.nextDouble();
		System.out.println("Enter the price of PizzaB");
		double pricePizzaB = keyboard.nextDouble();

		double radiusPizzaA = diameterPizzaA / 2.0;
		double radiusPizzaB = diameterPizzaB / 2.0;

		double areaPizzaA = Math.PI * Math.pow(radiusPizzaA, 2.0);
		double areaPizzaB = Math.PI * Math.pow(radiusPizzaB, 2.0);

		double pricePerSqrInPizzaA = pricePizzaA / areaPizzaA;
		double pricePerSqrInPizzaB = pricePizzaB / areaPizzaB;

		pricePerSqrInPizzaA = (double) Math.round(pricePerSqrInPizzaA * 1000) / 1000;
		pricePerSqrInPizzaB = (double) Math.round(pricePerSqrInPizzaB * 1000) / 1000;

		double cheaperPrice = Math.min(pricePerSqrInPizzaA, pricePerSqrInPizzaB);

		if (cheaperPrice == pricePerSqrInPizzaA) {
			System.out.println("PizzaA is the cheaper pizza at: $" + pricePerSqrInPizzaA + " per square inch.");
		} else {
			System.out.println("PizzaB is the cheaper pizza at: $" + pricePerSqrInPizzaB + " per square inch.");
		}

	}

}
