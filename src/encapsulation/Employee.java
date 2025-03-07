package encapsulation;

public class Employee {

	private String Name;
	private int age;
	private int salary;
	
	public void setName(String name) {
		this.Name=name;
	}
	public String getName() {
		return Name;
	}
	public void setAge(int age) {
		if(age>18) {
			this.age=age;
		}else {
			System.out.println("Age must be greater than 18");
		}
	}
	public int getAge() {
		return age;
	}
	public void setSalary(int salary) {
		if(salary>2000) {
		this.salary=salary;
		}else {
			System.out.println("Salary must be positive");
		}
	}
	public int getSalary() {
		return salary;
	}
}
