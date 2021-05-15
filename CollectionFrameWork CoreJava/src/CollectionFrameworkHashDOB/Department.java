package CollectionFrameworkHashDOB;

public class Department {

	private Integer deptid;
    private String deptname;

    public Department(Integer deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "Department{" +
               "deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                '}';
    }

}
