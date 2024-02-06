package Testing;

import java.util.Scanner;

class ajao{
	int num;
	String name;
	
	public void show() {
		System.out.println(num+" "+ name);
	}
	
}

public class test1 {
	public static void main(String[] args) {
	      int num;
	      String name;
	      num=0;
	      name="AVI";
	      System.out.println(name + " "+ num);
	      
	      ajao t=new ajao();
	      t.show();
	}
	

	

}
