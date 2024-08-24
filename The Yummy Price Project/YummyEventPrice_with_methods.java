package mycompany.com;
import java.util.Scanner;

public class YummyEventPrice_with_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int perPerson = 35;
		Scanner scanner = new Scanner(System.in);
	
		
		
		int numberOfPeople = numberOfPeople();
		yummyMotto();
		yourEvent(perPerson, numberOfPeople);
		
		
		
		
		
	}

		public static int numberOfPeople() {
			System.out.println("How many people are attending: ");
			Scanner scanner = new Scanner(System.in);
			int numberOfPeople = scanner.nextInt();
			return numberOfPeople;
		}
		
		public static void yummyMotto () {
			System.out.println("*Yummy makes the food that makes it a party*");
		}
		
		public static void yourEvent (int numberOfPeople, int perPerson ) {
			System.out.println("Do you have 50 or more guest for a large event? Enter 'True' or 'False': ");
			new Scanner(System.in).nextBoolean();
			 
			System.out.println("It's $35 per person.");
			int totalPrice = perPerson * numberOfPeople;
			
			System.out.println("Total price: $" + totalPrice );
			
			
			
		}
}
