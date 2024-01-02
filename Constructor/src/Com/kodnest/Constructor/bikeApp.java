package Com.kodnest.Constructor;

public class bikeApp {

	public static void main(String[] args) {
Bike bike=new Bike("Jupiter","Black",80000);
System.out.println(bike.brand+" "+bike.color+" "+bike.cost);
bike.Ride();
	}

}
