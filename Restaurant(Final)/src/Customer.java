import java.util.Scanner;

public class Customer extends Person {
	String food;
	static double price;
	public Customer(String name, String food) {
		super(name);
		this.food = food;
	}
	
	public void order (Cashier cashier, Cook cook ) {
		System.out.println(this.name + ": Can you give me " + this.food + " please? ");
		cashier.takeOrder(this.food, this, cook);
	}
	
	public void recieve (String food) {
		System.out.println(this.name + ": Thank you! It looks delicious!");
		System.out.println("Cashier: Here is your receipt! ");
		
	}
	
	public static void main(String[] args) {
		
		double priceCheese = 20;
		double priceShrimp = 25;
		double priceMacaroni = 22;
		double priceCream = 12;
		double priceTomato = 10;
		
		String food;
		
			System.out.printf("MENU: Cheese Pizza(L)		$%4.2f%n",priceCheese);
			System.out.printf("      Shrimp Pizza(L)		$%4.2f%n",priceShrimp);
			System.out.printf("      Macaroni Pizza(L)     	$%4.2f%n",priceMacaroni);
			System.out.printf("      Cream Pasta		$%4.2f%n",priceCream);
			System.out.printf("      Tomato Pasta		$%4.2f%n",priceTomato);
			
			int index;
			System.out.println();
			System.out.println("What would you like to order? ");
			Scanner scan = new Scanner(System.in);
			food = scan.nextLine();
			if(food.contains("Cheese")) {
				 price = priceCheese;
				 
			}
			else if(food.contains("Shrimp")) {
				price=priceShrimp;
				
			}
			else if(food.contains("Macaroni")) {
				price=priceMacaroni;
				
			}
			else if(food.contains("Cream")) {
				price=priceCream;
				
			}
			else if(food.contains("Tomato")) {
				price=priceTomato;
				
			}
			
			System.out.println("How many would you like to order? ");
			int amount = scan.nextInt();
			
					
		
		
		Customer myCustomer = new Customer("You", food);
		Cashier cash = new Cashier("Cashier");
		Cook cooking = new Cook("Cook");
		
		
		myCustomer.order(cash, cooking);
		
		
		
		double total = price*amount;
		System.out.printf("__________________________________________%n");
		System.out.printf("                                        %n");
		System.out.printf("                Jeff-Mart               %n");
		System.out.printf("                                        %n");
		System.out.printf("  products(price)     amount    price   %n");
		System.out.printf("                                        %n");
		System.out.printf("                                        %n");
		System.out.printf("  "+ food +"(%4.2f)    %2d    $%6.2f    %n",price,amount,price*amount);
		System.out.printf("                                        %n");
		System.out.printf("                                        %n");
		System.out.println("       It is "+total+ " dollars total           ");
		System.out.printf("__________________________________________%n");

	
		
		
		
	}
	

}
