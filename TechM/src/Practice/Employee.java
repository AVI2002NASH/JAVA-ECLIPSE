package Practice;

public class Employee {
    private int code;
    private String name;
    
    public Employee() {
    	code=0;
    	name="Avi";
    }
    public Employee(int i,String s) {
    	code=i;
    	name=s;
    }
    public void showDetails() {
    	System.out.println(code+" "+name);
    	
    }
    
}
