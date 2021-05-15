package collectionFrameWork;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DOBEmp {	
	private Integer day;
    private Integer month;
    private Integer year;
    public DOBEmp(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DOBEmp)) return false;
        DOBEmp date = (DOBEmp) o;
        return Objects.equals(getDay(), date.getDay()) && Objects.equals(getMonth(), date.getMonth()) && Objects.equals(getYear(), date.getYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getMonth(), getYear());
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
class datacomparator implements Comparator<DOBEmp> {
    @Override
    public int compare(DOBEmp d1, DOBEmp d2) {
        if (d1.getDay().compareTo(d2.getDay()) == 0)
            return 0;
        return 0;
    }
}
class Emp {
    private String name;
    public Emp(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Emp e1 = new Emp("dinesh");
        Emp e2 = new Emp("chinna");
        Emp e3 = new Emp("sai");
        DOBEmp d1 = new DOBEmp(1, 11, 2001);
        DOBEmp d2 = new DOBEmp(1, 11, 2000);
        DOBEmp d3 = new DOBEmp(2, 12, 20021);
        Map<DOBEmp, Emp> m1;
        m1 = new HashMap<DOBEmp, Emp>();
        m1.put(d1,e1);
        m1.put(d1,e2);
        m1.put(d1,e3);
        m1.put(d2,e1);
        m1.put(d2,e2);
        m1.put(d3,e3);
        for(Map.Entry<DOBEmp,Emp> entry: m1.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
