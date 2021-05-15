package organationOOPS;

public class Manager extends EmployeeOrg{
	int incentive;
	float time;
	
	
	 Manager(int id, String Name, int salary, int incentive, float time) {
		this.incentive = incentive;
		this.time = time;
	}
	
	public int getIncentive() {
		return incentive;
	}
	
	public void getIncentive(int incentive) {
		this.incentive = incentive;
	}
	public float getTime() {
		return time;
	}
	
	public void getTime(float time) {
		this.time = time;
	}
	
  public int getSalaryM() {
	   return(getSalary() + getIncentive());
   }
	
	@Override
	public String toString() {
	 	return super.toString();
	}
	
	}

	
	

