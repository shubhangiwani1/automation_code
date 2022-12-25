package javaPackage;

public class EH5 {

	public static void main(String[] args) {
	 String y = "Selenium";
	 
	 try {
		 int i = Integer.parseInt(y);
		 
	 }
 catch (Exception e){
	 e.printStackTrace();
 }
	 System.out.println("exception handled");
	}

}
