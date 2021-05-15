package dsessertShopApp;

public abstract class DessertItem {
	public String Name;	
	public int Tex;
	
	public abstract double getCost();
	
	public DessertItem(String Name, int Tex) {
		this.Name = Name;
		this.Tex = Tex;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
	Name = name;
	}
	
	public int getTex() {
		return Tex;
	}

	public void setTex(int tex) {
	Tex = tex;
	}
	

}
