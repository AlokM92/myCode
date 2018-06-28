package alok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Compr {
public static void main(String args[]){
	List<Employee> li=new ArrayList<>();
	li.add(new Employee(0, "s", 300));
	li.add(new Employee(5, "a", 1030));
	li.add(new Employee(9, "b", 1100));
	li.add(new Employee(2, "l", 122200));
	li.add(new Employee(2, "l", 600));
	
	Collections.sort(li,new SalaryComp());
	for(Employee e:li){
		System.out.println(e.id+" "+e.name+" "+e.salary);
	}
	
}
}
