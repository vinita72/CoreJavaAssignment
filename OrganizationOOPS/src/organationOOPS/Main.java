package organationOOPS;

public class Main {
	static int totalSalary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager M1 = new Manager(1, "M1", 2000, 500, 4.00f);
		Manager M2 = new Manager(2, "M2", 2000, 400, 3.00f);
		
		Labour L1 = new Labour(1, "L1", 1000, 200, 3.00f);
		Labour L2 = new Labour(2, "L2", 2000, 100, 2.00f);
		
		M1.getSalary(2000 + 500);

		System.out.println("Salary of Manager= " +M1.getSalary());
		
		M2.getSalary(2000 + 400);

		System.out.println("Salary of Manager= " +M2.getSalary());
		
		L1.getSalary(1000 + 200);

		System.out.println("Salary of Labour= " +L1.getSalary());
		
		L2.getSalary(2000 + 100);

		System.out.println("Salary of Labour= " +L2.getSalary());
		
		totalSalary =  M1.getSalary() + M2.getSalary() + L1.getSalary() + L2.getSalary();
		System.out.println("Salary of all employees = " +totalSalary);

		
	}

}
