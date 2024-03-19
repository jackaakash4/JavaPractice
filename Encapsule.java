class Account{
	private long acc_no;
	private String name, email;
	private float amount;

	public long getAcc_no(){
		return acc_no;
	}
	
	public void setAcc_no(long acc_no){
		this.acc_no = acc_no;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}

	public float getAmount(){
		return amount;
	}
	public void setAmount(float amount){
		this.amount = amount;
	}
}

public class Encapsule{
	public static void main(String[] args){
		Account acc1 = new Account();
		acc1.setAcc_no(10809321);
		acc1.setName("Jack");
		acc1.setEmail("abc@gmail.com");
		acc1.setAmount(100000000f);


		System.out.println(acc1.getAcc_no() + " " + acc1.getName()+ " " + acc1.getEmail() + " " + acc1.getAmount() );
	}
}




























