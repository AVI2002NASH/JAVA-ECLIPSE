package Some;

public class B {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.a);
		System.out.println(obj.getB());
		System.out.println(obj.c);
		
		
		obj.setB(200);
		System.out.println(obj.getB());
		
	}

}
