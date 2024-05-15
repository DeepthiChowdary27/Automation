package corejava;

public class Operators {

	public static void main(String[] args) {
		//
		//Arithmetic operators
		int a=20;
		int b=10;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a+b);
		
        
		// Comparison Operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		// Logical Operators
		
		boolean x =true;
		boolean y =false;
				
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		 //&&Incremental Operators 
		int i=10;
		i++; // i=i+1; 
		System.out.println(i); // 11
		i--;  // i=i-1;
		System.out.println(i); // 10
		i+=5;
		System.out.println(i); // 15
		++i;
		System.out.println(i); // 16
		i=i+5;
		System.out.println(i); // 21
		i-=5;
		System.out.println(i); // 16
	}

}
