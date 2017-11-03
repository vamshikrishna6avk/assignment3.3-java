/*declaring and initializing two variables with some values.differentiate between Bitwise AND and Logical AND*/

package operator;// here I have created a package as operator

public class LogicalBitwise{
	////declares a class called LogicalBitwise
	//classes are the basics of opps(object oriented programming)

		public static void main(String[] args) {
			//* first to check  Logical "And" operator
			//declares method String[]
			//String[]args means arguments will be passed into main method and says that main() as a parameter 
	        System. out .println( "Logical AND Operator" );
	        int a =10;//1010
	        int b =20;//10100
	        int c =30;//11110
	        int d =40;//101000
	        
	        boolean ans = b>a && b<c && c<d;
	        
	        System. out .println( " answer is " +ans);
			
	        boolean ans1 =b<a && b<c && c<d ;
	        /* here b is less  than a,
	        and b is less than c,
	        and c is less than d,
	         expression1 false and exp2 and exp3 are true  so the given statement is false
	     */
	        System. out .println( " answer is " +ans1);
			
	 
	        boolean ans2 = b>a && b>c && c>d;
	        /* here b is greater  than a,
	        and b is greater than c,
	        and c is greater than d,
	         here exp1 is true and exp2,exp3 are false so the statement is false
	     */
	        System. out .println( " answer is " +ans2);
			
	              
	        boolean ans3 = b<a && b>c && b<d && c<d;
	        /* here b is less  than a,
	        and b is greater than c,
	        b is less than d,
	        and c is less than d,
	         the given exp1,exp2 are false exp3and exp4 are there is  an error at q<p ,q>r so it is false
	     */
	        System. out .println( " answer is " +ans3);
	        System. out .println("to show bitwise AND operator");
	        /* BITWISE AND OPERATOR*/
	        System. out .println( " answer is "  +(a&b));//here value is zero 
	        System. out .println( " answer is "  +(b&c));//here value is 20
	        System. out .println( " answer is "  +(b&d));/*after calculating the values it becomes 0
	        
	    */
	        System. out .println( " answer is "  +(c&d));
	        /*
	        c=11110
	        d=101000
	         =001000
	         =0010 
	         */
	       //success
			
		}
}
