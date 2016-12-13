
	public class Cook extends Person {
		public Cook (String name) {
			super(name);
		}
		
		public void cooking (String food, Cashier cashier, Customer customer) {
			System.out.println(this.name + ": Order up!");
			cashier.serve(food, customer);
		}
	}
