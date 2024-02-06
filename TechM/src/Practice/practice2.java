package Practice;

abstract class Emp {
	protected int code;
	protected String name;
	protected float sal;
	public Emp(int i, String name2, float sal2) {
		code=i;
		name=name2;
		sal=sal2;
		System.out.println("Emp base"); //poly overloading ctor
	}
	abstract public void Salary();
	public void salary() {
		// TODO Auto-generated method stub
		
	}
}

class Manager extends Emp{
	public Manager(int i,String name,float sal) {
		super(i,name,sal); //It gives call to base constructor
		System.out.println("Manager");
	}
	public void show() {
		System.out.println(code+" "+name+" "+sal);
		
	}
	
	//override
	public void Salary() {
		System.out.println("Manager salary");
	}
	public void fly() {
		System.out.println("Manager fly..");
	}
}

public class practice2 {
	public static void main(String[] args) {
		Manager m = new Manager(3,"hello",2);
		m.show();
		m.salary();
		
		Emp e = new Manager(20,"Sita",200);
		e.salary();
	}
}