
public class Customer {

	
	private String name;
	private String address;
	private Policy policy;
	
	
	
	public Customer(String name, String address, Policy policy){
		
		this.name = name;
		this.address = address;
		this.policy = policy;
		
	}
	
	public Policy getPolicy(){
		return policy;
		
	}
	
	public void setPolicy(Policy policy){
		
		this.policy = policy;
		
	}
}
