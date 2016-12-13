import java.util.Scanner;

public class Customer extends Person {
	String food;
	
	public Customer(String name, String food) {
		super(name);
		this.food = food;
	}
	
	public void order (Cashier cashier, Cook cook ) {
		System.out.println(this.name + ": Can you give me "+ this.food + " please? ");
		cashier.takeOrder(this.food, this, cook);
	}
	
	public void recieve (String food) {
		System.out.println(this.name + ": Thank you! It looks delicious!");
		System.out.println("Cashier: Here is your receipt! ");
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("MENU: Cheese Pizza(L)		$20");
		System.out.println("      Shrimp Pizza(L)		$25");
		System.out.println("      Macaroni Pizza(L)     	$22");
		System.out.println("      Cream Pasta		$12");
		System.out.println("      Tomato Pasta		$10");
		
		System.out.println();
		System.out.println("What would you like to order? ");
		Scanner scan = new Scanner(System.in);
		String food = scan.nextLine();
		System.out.println("How many would you like to order? ");
		int amount = scan.nextInt();
		Customer myCustomer = new Customer("You", food);
		Cashier cash = new Cashier("Cashier");
		Cook cooking = new Cook("Cook");
		
		myCustomer.order(cash, cooking);
		
		
		
	}
	

}
