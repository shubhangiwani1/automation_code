package javaPackage;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(1, "Jan");
		hm.put(2, "feb");
		hm.put(3, "mar");
		//hm.put(4, null);  //java.lang.NullPointerException
		//hm.put(4, null);   //java.lang.NullPointerException
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm);
		
	}

}
