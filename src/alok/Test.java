package alok;

public class Test {
	int id;
	public int getId(int i) {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static void main(String args[]) throws CloneNotSupportedException{
	
	Test obj=new Test();
	Test a,b;
	obj.setId(15);
	a=obj;
	a.setId(3);
	b=(Test) a.clone();
	b.setId(9);
	System.out.print("1"+obj.getId(8));
	System.out.print("2"+a.getId(15));
	System.out.print("3"+obj.getId(10));
	}
}
