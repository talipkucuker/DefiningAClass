package DefiningAClass;

public class Vehicle {

	int passengers; //number of passengers
	int fuelcap; //fuel capacity in gallons
	int mpg; //fuel consumption in miles per gallon
	
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	int range() {
		return fuelcap * mpg;
	}
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

