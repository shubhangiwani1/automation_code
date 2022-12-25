package javaPackage;

public class LargerstSmallestNumber {

	public static void main(String[] args) {
		
		
		int[] a = {23,9,24,5,32,100,2};
		
	int	largest =  a[0];
	int	smallest = a[0];
	
	for (int i =0;i < a.length; i++)
		{
		if (a[i] > largest)
		{
			largest = a[i];
		}
		else if
		(a[i] < smallest)
		{
			smallest =a[i];
		}
		
	}
		
		System.out.println("larget no is :" +largest);
		System.out.println("smallest no is :" +smallest);
		
		
		

	}

}
