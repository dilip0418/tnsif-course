package com.dilip.dayTwelveCodes.lambdaDemo;

/*interface LambdaDemoInterface{
//	String wish();
	Double getGravityConst();
}*/

interface LambdaDemoInterface{
//	String getUpper(String str);
//	int add(int a, int b);
//	int fact(int n);
	boolean isOdd(int n);
}

public class LambdaExample {

	public static void main(String[] args) {
		
		/*
		 * Types of Lambda Expressions: 
		 * 1. Non Parametric 
		 * 2. Parametric 
		 * 		i. Single Parameter 
		 * 		ii. Multi Parameter
		 */				
		/*
		LambdaDemoInterface ldi;
		 * 1. Non Parametric 
		 * ldi = () -> "Hello! Hru"; 
		 * System.out.println(ldi.wish());
		 * ldi = ()-> 9.8; 
		 * System.out.println(ldi.getGravityConst());
		 */
		//2. Parametric
		//i. Single
		/*
		 * LambdaDemoInterface ldi = s -> s.toUpperCase();
		 * System.out.println(ldi.getUpper("dilip"));
		 */
		//ii. Multi Parametric
		/*
		 * LambdaDemoInterface ldi = (a, b)->a+b; 
		 * System.out.println(ldi.add(10, 40));
		 */
		
		//Multi-line lambda expression
		/*
			int fact = 1;
			if(n== 0|| n==1||n==2)
				return n;
			else {
				for(int i = n;i>1;i--)
					fact *=i;
			}
			return fact;
		};
		System.out.println(ldi.fact(5));
		 */
		LambdaDemoInterface ldi = (n)->n%2!=0;
		System.out.println(ldi.isOdd(5));
	}

}



/*
() -> {}                     // No parameters; void result

() -> 42                     // No parameters, expression body
() -> null                   // No parameters, expression body
() -> { return 42; }         // No parameters, block body with return
() -> { System.gc(); }       // No parameters, void block body

// Complex block body with multiple returns
() -> {
  if (true) return 10;
  else {
    int result = 15;
    for (int i = 1; i < 10; i++)
      result *= i;
    return result;
  }
}                          

(int x) -> x+1             // Single declared-type argument
(int x) -> { return x+1; } // same as above
(x) -> x+1                 // Single inferred-type argument, same as below
x -> x+1                   // Parenthesis optional for single inferred-type case

(String s) -> s.length()   // Single declared-type argument
(Thread t) -> { t.start(); } // Single declared-type argument
s -> s.length()              // Single inferred-type argument
t -> { t.start(); }          // Single inferred-type argument

(int x, int y) -> x+y      // Multiple declared-type parameters
(x,y) -> x+y               // Multiple inferred-type parameters
(x, final y) -> x+y        // Illegal: can't modify inferred-type parameters
(x, int y) -> x+y          // Illegal: can't mix inferred and declared types
*/