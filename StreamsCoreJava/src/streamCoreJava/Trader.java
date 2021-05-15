	package streamCoreJava;
	
	public class Trader {
	 public String tname;
	 public String tcity;
	 
	 
	public Trader(String tname, String city) {
		super();
		this.tname = tname;
		this.tcity = tcity;
	}
	public String getTName() {
		return tname;
	}
	public void setName(String tname) {
		this.tname = tname;
	}
	public String getTCity() {
		return tcity;
	}
	public void setTCity(String tcity) {
		this.tcity = tcity;
	}
	@Override
	public String toString() {
		return "Trader [Tname=" + tname + ", Tcity=" + tcity + "]";
	}
	
	 
}
