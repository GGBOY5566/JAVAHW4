
public class p25 {

	public static void main(String[] args) {
		car car1 = new car();
		car car2 = new car();
		car car3;
		car3 = car1;
		
		System.out.println("Car1 與 Car2 相同"+car1.equals(car2));
		System.out.println("Car1 與 Car3 相同"+car1.equals(car3));

	}

}

class car{
	protected int num;
	protected double gas;
	
	public car() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
}
