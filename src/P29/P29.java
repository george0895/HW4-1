package P29;

public class P29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vc = new Vehicle[2];
		
		vc[0]= new Car(1234,20.5);
		vc[0].setSpeed(60);
		
		vc[1] = new Plane(233);
		vc[1].setSpeed(500);
		
		for(int i=0;i<vc.length;i++)
		{
			vc[i].show();
		}

	}

}

abstract class Vehicle
{
	protected int speed;
	public void setSpeed (int s)
	{
		speed =s;
		System.out.println("將速度設為"+speed);
	}
	
	abstract void show();
}

class Car extends Vehicle
{
	private int num;
	private double gas;
	
	public Car(int n,double g)
	{
		num =n;
		gas =g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas); 
	}
	
	public void show()
	{
		System.out.println("車號為"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}
class Plane extends Vehicle
{
	private int flight;
	
	public Plane(int f) 
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}