
public class Cashier extends Person {

	public Cashier(String name) {
		super(name);
	}
	
	
	
	public void takeOrder(String orderedFood, Customer customer, Cook cook) {
		System.out.println(this.name + ": Sure! We've got an order for " + orderedFood + "!");
		cook.cooking (orderedFood, this, customer);
	}
	
	public void serve(String food, Customer customer) {
		System.out.println(this.name + ": Here is your " + food + "!");
		customer.recieve(food);
	}

	
	
		
}

