class Employee{
	int salary = 35000;
}

class Engineer extends Employee{
	int benifits = 10000;
}

class Inheritance1{
	public static void main(String[] args){
		Engineer e1 = new Engineer();
		System.out.println("Salary is : " + e1.salary + " Benifits is : " + e1.benifits);
	}
}

