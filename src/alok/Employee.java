package alok;

import java.util.Comparator;

public class Employee {

	int id;
	String name;
 int salary;
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}*/
	public Employee(int id, String name, int salary) {
		super();
		this.name = name;
		this.id = id;
		
		this.salary = salary;
	}
	/*public String getString(){
		return "[ID"+id+"Name"+name+"salary"+salary+"]";
	}*/
	
	/*public int compareTo(Employee obj) {
		if(this.id<obj.id)
		return -1;
		else
			return 1;
	}*/
}