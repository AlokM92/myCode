package alok;

import java.util.Comparator;

class SalaryComp implements Comparator<Employee>{
		
	
	public int compare(Employee e1,Employee e2) {
		if(e1.salary<e2.salary)
			return 1;
			else
				return -1;
		
	}
}
