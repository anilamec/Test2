package beginner;

public class Employees {

	String name;
	String address;
	int number;
	
	public Employees() {
		
	}
	
	public Employees (String name, String address, int number) {
		System.out.println("Constructing an employee");
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	public void mailCheck() {
		System.out.println("Mailing a chek to "+this.name+" "+this.address);
	}
	
	public String toString() {
		return name+" " + address + " " + number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String newAddress) {
		address=newAddress;
	}
	
	public int getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
}
