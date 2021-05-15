package dsessertShopApp;

public class Cookie extends DessertItem{
	int costInEuro;
	public Cookie(String Name, int Tex, int costInEuro) {
		super(Name, Tex);
		this.costInEuro = costInEuro;
		// TODO Auto-generated constructor stub
	}

	
	public int getcostInEuro() {
		return costInEuro;
	}

	public void setcostInRupees(int CostInEuro) {
		CostInEuro = costInEuro;
	}
	@Override
	public double getCost() {
		double total = Tex * costInEuro;
		total = Math.round(total * 100 + 70);
		return total;		
	}
	
	public String toString()
	{
	String s = String.format("%s", getName(), getCost()/100, costInEuro);
	return s;
	}
	

}
