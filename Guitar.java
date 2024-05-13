public class Guitar{
	private String serialNumber, builder, model, type, backWood, topWood;
	private double price;
	
	public Guitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood){
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public String getSerialNumber(){
		return this.serialNumber;
	}

	public double getPrice(){
		return this.price;
	}
	public void setPrice(float price){
		this.price = price;
	}
	public String getBuilder(){
		return this.builder;
	}

	public String getType(){
		return this.type;
	}

	public String getBackWood(){
		return this.backWood;
	}
	public String getTopWood(){
		return this.topWood;
	}
}

