package Day13EncapsulationSettersGetters;

public class EncapsulationDemoAccount {
	private int account_number;
	private String name;
	private Double amount;
	
	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public static void main(String[] args) {
		EncapsulationDemoAccount encap=new EncapsulationDemoAccount();
		
		encap.setAccount_number(1000);
		encap.setName("Anjali Jain");
		encap.setAmount(2757654254533.8);
		System.out.println(encap.getAccount_number());
		System.out.println(encap.getName());
		System.out.println(encap.getAmount());
	}

}
