package collectionFrameWork;

import java.util.TreeSet;

public class PersonWeightHeight {

	
	int weight;
	double height;
	String name;
	
	public PersonWeightHeight(int weight, double height, String name) {
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	int getWeight() {
		return weight;
	}
	double getHeight() {
		return height;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name= name;
	}
	public int compareTo(PersonWeightHeight person) {
		return this.getWeight() - person.getWeight();
		
	}
	public String toString() {
		return "PersonWeightHeight{" + "weight " +weight+ ", height "+height+ ", name "+name+ "}" ;
	}
	

	public static void main(String[] args) {
		TreeSet<PersonWeightHeight> person = new TreeSet<>();
		
		person.add(new PersonWeightHeight(60, 5.8, "Rahul"));
		person.add(new PersonWeightHeight(75, 5.10, "Tiwari"));
		person.add(new PersonWeightHeight(60, 5.5, "Mishra"));
		person.add(new PersonWeightHeight(80, 6.1, "Kaushik"));
		
		System.out.println("Person soted on the basis of their weight :");
		System.out.println(person);

	}
}
