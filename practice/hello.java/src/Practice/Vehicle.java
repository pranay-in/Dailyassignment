package Practice;

public class Vehicle {
	void run() {
		System.out.println("vehicle is running");
	}
	class Bike extends Vehicle
	{
		void run() {
		
		System.out.println("bike running always safely");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Bike obj=new Bike();
            obj.run();
	}

}
