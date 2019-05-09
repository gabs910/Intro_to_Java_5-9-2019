package abstractions;

public class Ship extends Vehicle {

		@Override
		public void move(int miles) {
			
			System.out.println("moving the Ship " + miles + " miles");
		}
		public void shipMethod(){
			System.out.println("Calling the Ship method");
			
		}//shipMethod
		@Override
		public void loadFuel(int gallons) {
			System.out.println("Loading " + gallons + " gallons into the Ship");

		}//loadFuel
}
