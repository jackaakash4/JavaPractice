class Complex{

	private double real, img;

	public Complex(double real, double img){
		this.real = real;
		this.img = img;
	}

	//copy constructor
	
	Complex(Complex c){
		System.out.println("Copy constructor is called");

		real = c.real;
		img = c.img;
	}

	@Override public String toString(){
	
		return "(" + real + " + " + img + "i)";
	}

public
