import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Arraytest {

	public static void main(String[] args) {

	LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer,String >();
 
  int[] price = {600,650,200,284};
  String[] products = {"tata", "Gala", "Pixel 4", "man"};
 
   for (int i=0; i< products.length; i++) {
	   	      
	   hm.put(price[i],products[i] );
	  	      }
   System.out.println(hm);
  
	}

}
