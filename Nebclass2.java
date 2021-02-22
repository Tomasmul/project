package Nebclass;

public class Nebclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName="Nebyou";
		String lastName ="Grtane";	
		String name[] = {"Nebyou", "Nebyou","Grtane", "Grta"};
		
		System.out.println(name[3]);
		
		// declaring an array, by allocating a value
		int a[] = new int[5];
		a[0]=23;
		a[1]=100;
		a[2]=25;
		a[3]=87;
		a[4]=102;
		
	   System.out.println(a[4]);
	   
	// declaring an array with automatic allocating memory. 
	   int b[] = {12,100,25,87,102,256,1425};
	   
	   System.out.println(b[5]);
	   
	   int c;
	   int num[] = {12,100,25,87,102,256,1425};
	   
	   for(int i=0; i < num.length; i++)
		   
	   {
		  // c=c +a[i];
		   System.out.println(num[i]);
	   }
	   
	}
	
	// String c;
	   String nume[] = {"Nebyou", "Nebyu","Grtane", "Grta"};

}
