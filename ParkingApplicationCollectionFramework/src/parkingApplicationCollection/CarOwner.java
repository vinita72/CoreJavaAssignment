package parkingApplicationCollection;

import java.util.Comparator;

public class CarOwner implements Comparable<CarOwner> {
	String ownerName;
	String CarModel;
	int carNo;
	long ownerMobileNo;
	String ownerAddress;
	public CarOwner(String ownerName, String carModel, int carNo, long ownerMobileNo,
	String ownerAddress) {
	super();
	this.ownerName = ownerName;
	CarModel = carModel;
	this.carNo = carNo;
	this.ownerMobileNo = ownerMobileNo;
	this.ownerAddress = ownerAddress;
	}
	public String getOwnerName() {
	return ownerName;
	}
	public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
	}
	public String getCarModel() {
	return CarModel;
	}
	public void setCarModel(String carModel) {
	CarModel = carModel;
	}
	public int getCarNo() {
	return carNo;
	}
	public void setCarNo(int carNo) {
	this.carNo = carNo;
	}
	public long getOwnerMobileNo() {
	return ownerMobileNo;
	}
	public void setOwnerMobileNo(long ownerMobileNo) {
	this.ownerMobileNo = ownerMobileNo;
	}
	public String getOwnerAddress() {
	return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
	this.ownerAddress = ownerAddress;
	}
	@Override
	public int compareTo(CarOwner o) {
	return 0;
	}
	
}
	class ParkOrder implements Comparator<CarOwner>{
	@Override
	public int compare(CarOwner e1, CarOwner e2) {
	return e1.getOwnerName().compareTo(e2.getOwnerName());
	}
		
}
