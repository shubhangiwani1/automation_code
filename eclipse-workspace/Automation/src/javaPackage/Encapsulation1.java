package javaPackage;

public class Encapsulation1 {

	String name;
	int b;
	final int c=12;
	
	public void setname(String a) {
		this.name =a;
		this.b=5;
		System.out.println(b);
		System.out.println(c);
		
	}
	
	public Object getname() {
		return name;
		
	}
}
