package javaPackage;

import java.util.Arrays;

public class sortstringaphabetically {

	public static void main(String[] args) {
		String s = "DCBAz";
		
		char [] sorting = s.toCharArray();
		Arrays.sort(sorting);
		for (char b:sorting)
{
	System.out.println(b);
}
		

	}

}
