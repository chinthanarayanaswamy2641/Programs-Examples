package encapsulation;

public class Demo {

	public static void main(String[] args) {
		Employee emp=new Employee();
        emp.setName("Arun");
        emp.setAge(35);
        emp.setSalary(45000);
       System.out.println(emp.getName());
      System.out.println(emp.getAge());
        System.out.println(emp.getSalary());
	}

}
