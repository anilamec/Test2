package beginner;
public class puppy {
int puppyAge;

public puppy(String name) {
	//This constructor has one parameter, name.
	System.out.println("Name choose is: " + name);
}

public void setAge(int age) {
	puppyAge =age;
}

public int getAge() {
	System.out.println("Puppy's age is :"+ puppyAge);
	return puppyAge;
}

public static void main(String Args[]) {
	puppy myPuppy = new puppy("Tommy");
	
	myPuppy.setAge(10);
	myPuppy.getAge();
	System.out.println("Puppy's age is :"+ myPuppy.puppyAge);
}
}
