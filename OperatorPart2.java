public class OperatorPart2{
	public static void main(String[] args){
		int num1 = 15;
		int num2 = 30;
		int num3 = 50;
		
		boolean isAndLogical = (num1 > num2) && (num1 > num3);
		System.out.printf(" is(%d > %d) && (%d > %d) = %b%n",num1,num2,num1,num3,isAndLogical);
		
		boolean isOrLogical = (num1 > num2) ||(num1 < num3);
		System.out.printf(" is (%d > %d) || (%d < %d) = %b%n",num1,num2,num1,num3,isOrLogical);
		
		boolean isNotLogical = !(num1 > num2) ||(num1 < num3);
		System.out.printf(" is!(%d > %d) || (%d < %d) = %b%n",num1,num2,num1,num3,isNotLogical);

		//UnaryOperator(++ ,--)
		//(Pre-increament (now) , post- increament) (later)
		
		int x = 10;
		int y = 20;
		System.out.printf("The value of x is %d%n",++x);
		System.out.printf("The value of y is %d%n",y++);
		System.out.printf("The value of y is %d%n",y);
		
		
		
		System.out.printf("The value of x is %d%n",--x);
		System.out.printf("The value of y is %d%n",y--);
		System.out.printf("The value of y is %d%n",y);
	}
}