package javaPackage;

import java.util.HashSet;
import java.util.Set;

public class removeduplicatefrostring {

	public static void main(String[] args) {
		String s ="shubshbbbnwaniw";
		StringBuilder sb =new StringBuilder();
		
		char [] ch= s.toCharArray();
			
				Set <Character> hs = new HashSet<Character>();
				 
		for(int i=0;i<ch.length;i++) {
			if (hs.add(ch[i])) {
				sb.append(ch[i]);
				
				
			}
		}
		System.out.println(sb);

	}

}
