package javaPackage;
import java.util.Arrays;


public class Try {

	public static void main(String[] args) {
	int [] a = {4,5,7,8};
	int [] b = {-2,6,9,3,8};
	
 int	i=a.length;
 int  j=b.length;

int [] r=  new int [i+j];


	System.arraycopy(a, 0, r, 0, i);
	System.arraycopy(b, 0, r, i, j);
	
	System.out.println(Arrays.toString(r));
	Arrays.sort(r);
	
	for (int k =0; k<r.length;k++)
	{
		System.out.print(r[k] +" ");
	}
	

	}

}
