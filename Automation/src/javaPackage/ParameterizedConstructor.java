package javaPackage;

public class ParameterizedConstructor {
	
	int id;
	String name;
	String address;
	
	//Default Constructor
	ParameterizedConstructor(){
		System.out.println("hello default constructor");
	}
	//Parameterized Constructor
	ParameterizedConstructor(int a, String b, String c){
		this.id=a;
		this.name=b;
		address=c;
	}
	//non static method
	
	public void displayinfo() {
		System.out.println(id+"  "+name+"  "+address);
	}

	public static void main(String[] args) {
		ParameterizedConstructor pc1 =new ParameterizedConstructor();
		
		ParameterizedConstructor pc2 = new ParameterizedConstructor(2,"Shubhangi","Kalyan");
		ParameterizedConstructor pc3 = new ParameterizedConstructor(3,"John","Thane");
		
		
		pc1.displayinfo();
		pc2.displayinfo();
		
		pc3.displayinfo();
	}

}
