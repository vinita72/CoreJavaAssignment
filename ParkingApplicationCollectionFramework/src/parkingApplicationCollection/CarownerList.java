package parkingApplicationCollection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CarownerList {

	
	static Set<CarOwner> car=new TreeSet<CarOwner>(new ParkOrder());
	static CarOwner p1 = new CarOwner("Vachi","Ford Raptor",7999,40394802,"Delhi");
	static CarOwner p2 = new CarOwner("Kiya","Jensen",5893,83084239,"Ghaziabad");
	static CarOwner p3 = new CarOwner("Riya","Swift",1919,29302029,"Delhi");
	static CarOwner p4 = new CarOwner("Parv","Jeep ",3292,666666,"Punjab");
	
	
	static int add_new_car(CarOwner obj) {
	car.add(obj);

	if(obj.ownerName.equalsIgnoreCase("Vachi")) {
	System.out.println("Token no for Vachi: 1");
	}
	if(obj.ownerName.equalsIgnoreCase("Kiya")) {
	System.out.println("Token no for Kiya: 2");
	}
	if(obj.ownerName.equalsIgnoreCase("Riya")) {
	System.out.println("Token no Riya: 3");

	}
	return 0;

	}
	static void remove_car(String name) {
	for(CarOwner p:car) {
	if(name.equalsIgnoreCase(p.ownerName))
	car.remove(p);
	}
	for(CarOwner p:car) {
	System.out.println("Owner names of cars parked:"+ p.ownerName);}
	}
	static void get_parked_car_location(int token) {
	if(token==1) {
	System.out.println("Car Location : Floor 3, Section 4, Slot 32");
	}
	if(token==2) {
	System.out.println("Car Location : Floor 1, Section 8, Slot 10");
	}
	if(token==3) {
	System.out.println("Car Location : Floor 2, Section 3, Slot 20");
	}

	}
	public  static void main(String[] args) {
	add_new_car(p1);
	add_new_car(p2);
	add_new_car(p3);
	Scanner s= new Scanner(System.in);
	System.out.println("Enter your name");
	String n=s.nextLine();
	remove_car(n);
	System.out.println("Enter your token no.");
	int t=s.nextInt();
	get_parked_car_location(t);


}
}
