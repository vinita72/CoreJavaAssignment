package dsessertShopApp;

public class Candy extends DessertItem{
	int costInDoller;
	public Candy(String Name, int Tex, int costInDoller) {
		super(Name, Tex);
		this.costInDoller = costInDoller;
		// TODO Auto-generated constructor stub
	}
	public int getcostInDoller() {
		return costInDoller;
	}

	public void setcostInRupees(int CostInDoller) {
		CostInDoller = costInDoller;
	}

	@Override
	public double getCost() {

		double total = Tex * costInDoller;
		total = Math.round(total * 100 + 60);
		return total;
 }
	
	public String toString()
	{
	String s = String.format("%s", getName(), getCost()/100, costInDoller);
	return s;
	}
	

}
