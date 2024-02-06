package Testing;
import java.util.Scanner;
public class test {
	/** main method*/
	public static void main(String[] args) {
		int num1 ;
		int num2, result;  //PT basic
		Scanner sc=new Scanner(System.in);
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		result=num1+num2;
		System.out.println(result);
		sc.close();
	}

}
