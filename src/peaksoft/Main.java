package peaksoft;

public class Main {

    public static void main(String[] args) {
	Vehicle car1 = new Car ("Lexus GX460", 1918, TypeOfEngine.FUEL);
	Vehicle car2 = new Car ("Lexus LX570", 2007, TypeOfEngine.FUEL);
	Vehicle car3 = new Car ("Nissan Leaf", 2009, TypeOfEngine.ELECTROMOBILE);
	Vehicle car4 = new Car ("Toyota Estima", 2008, TypeOfEngine.HYBRID);
	Vehicle car5 = new Car ("Honda Fit", 2012, TypeOfEngine.HYBRID);
	Vehicle car6 = new Car ("Tesla Model X", 2018, TypeOfEngine.ELECTROMOBILE);
	Vehicle car7 = new Car ("Volkswagen", 2012, TypeOfEngine.FUEL);
	Vehicle car8 = new Car ("Lexus", 2012, TypeOfEngine.ELECTROMOBILE);
	Vehicle car9 = new Car ("BMW E", 2019, TypeOfEngine.ELECTROMOBILE);
	Vehicle car10 = new Car ("Audi Etron", 2018, TypeOfEngine.ELECTROMOBILE);
    Vehicle truck1 = new Truck("Belarus 82",2002, TypeOfEngine.FUEL);
    Vehicle truck2 = new Truck("K-700",1963, TypeOfEngine.FUEL);
    Vehicle truck3 = new Truck("Т-40",1989, TypeOfEngine.FUEL);
    Vehicle truck4 = new Truck("T-150",1970, TypeOfEngine.FUEL);
    Vehicle truck5 = new Truck("T-25",1968, TypeOfEngine.FUEL);
	Vehicle [] vehicles = {car1,car2,car3,car4,car5,car6,car7,car8,car9,car10,truck1,truck2,truck3,truck4,truck5};
	TypeOfEngine hybrid = null;
	TypeOfEngine electic = null;
	TypeOfEngine fuel = null;
		System.out.println("Булар гибриттер");
	for (Vehicle a : vehicles){
		if (a.getTypeOfEngine().equals(TypeOfEngine.HYBRID)){
			hybrid = a.getTypeOfEngine();
			System.out.println(hybrid+" "+a.getModel());
		}
	}
		System.out.println("Булар электромобилдер");
		for (Vehicle b : vehicles){
			if (b.getTypeOfEngine().equals(TypeOfEngine.ELECTROMOBILE)){
				electic = b.getTypeOfEngine();
				System.out.println(electic+" "+b.getModel());
			}
		}
		System.out.println("Булар ДВС");
		for (Vehicle c : vehicles){
			if (c.getTypeOfEngine().equals(TypeOfEngine.FUEL)){
				fuel = c.getTypeOfEngine();
				System.out.println(fuel+" "+c.getModel());
			}
		}

	try{
		System.out.println(car1);
		car1.getYearOfIssue();
	}catch (InvalidIssue a){
		System.err.println(a.getMessage());
	}

    }
}
