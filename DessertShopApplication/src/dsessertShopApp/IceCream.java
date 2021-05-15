package dsessertShopApp;

public class IceCream extends DessertItem{
	int costInRupees;
	public IceCream(String Name, int Tex, int costInRupees) {
		super(Name, Tex);
		this.costInRupees = costInRupees;
		// TODO Auto-generated constructor stub
	}
	
	public int getcostInRupees() {
		return costInRupees;
	}

	public void setcostInRupees(int CostInRupees) {
		CostInRupees = costInRupees;
	}

	@Override
	public double getCost() {
		double total = Tex * costInRupees;
		total = Math.round(total * 100);
		return total;
		// TODO Auto-generated method stub
		}
	
	public String toString()
	{
	String s = String.format("%s", getName(), getCost()/100, costInRupees);
	return s;
	}
	
	
	
}
