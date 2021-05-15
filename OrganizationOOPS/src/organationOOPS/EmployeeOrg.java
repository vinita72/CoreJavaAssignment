package organationOOPS;

public class EmployeeOrg {

		private int id;
		protected String Name;
		private int salary;
		
	
		public EmployeeOrg() {
			this.id = id;
			this.Name = Name;
			this.salary= salary;
		}
		
		public int getId() {
			return id;
		}
		public void getId(int id) {
			this.id=id;
		}
		
		public String getName() {
			 return Name;
		 }
		public void getName(String Name) {
			this.Name=Name;
		}
		 
		public int getSalary() {
			
			return salary;
		}
		public void getSalary(int salary) {
			this.salary=salary;
		}
		
		@Override
		public String toString() {
		 	return String.format(getName(), getId(), getSalary());
		}
}
