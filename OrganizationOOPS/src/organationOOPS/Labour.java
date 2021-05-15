package organationOOPS;

public class Labour extends EmployeeOrg {

	int overTime;
	float extraHours;
	
	public Labour(int id, String Name, int salary, int overTime, float extraHours) {
		this.overTime = overTime;
		this.extraHours = extraHours;
	}
	int getOverTime() {
		return overTime;
	}
	float getExtraHours() {
		return extraHours;
	}
	
	@Override
	public String toString() {
	 	return super.toString();
	}
}
