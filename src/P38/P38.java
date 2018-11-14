package P38;

public class P38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iVehicle[] ivc;
		ivc = new iVehicle[2];
		
		ivc[0] = new Car(1234,20.5);
		
		ivc[1] = new Plane(232);
		
		for(int i=0;i<ivc.length;i++)
		{
			ivc[i].show();
		}
	}

}

interface iVehicle
{
	int weight =1000;
	void show();
}

class Car implements iVehicle
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
	}
}

class Plane implements iVehicle
{
	private int flight;
	
	public Plane(int f)
	{
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
	}
}