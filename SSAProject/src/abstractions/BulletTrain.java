package abstractions;

public class BulletTrain extends Train {

	@Override
	public void move(int miles) {
		System.out.println("moving the BulletTrain " + miles + " miles");

	}//move

	@Override
	public void loadFuel(int gallons) {
		super.loadFuel(gallons);
		System.out.println("Loading " + gallons + " gallons into the Bullet Train");

	}//loadFuel

		
}//class
