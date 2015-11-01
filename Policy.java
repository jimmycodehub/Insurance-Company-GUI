
public class Policy {

	private int policyNumber;
	private int houseValue;
	private int sizeSqMetres;
	private double premium;
	
	public Policy(int policyNumber, int houseValue, int sizeSqMetres, double premium ){
		
		this.policyNumber = policyNumber;
		this.houseValue = houseValue;
		this.sizeSqMetres = sizeSqMetres;
		this.premium = premium;
	}
	
	//visibility, return, name, (prams)
	public int getPolicyNumber(){
		return policyNumber;
		
	}
	
	public void setPolicyNumber(int policyNumber){
		this.policyNumber = policyNumber;
		
	}

	public int getHouseValue() {
		return houseValue;
	}

	public void setHouseValue(int houseValue) {
		this.houseValue = houseValue;
	}

	public int getSizeSqMetres() {
		return sizeSqMetres;
	}

	public void setSizeSqMetres(int sizeSqMetres) {
		this.sizeSqMetres = sizeSqMetres;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	
	
	
	
}
