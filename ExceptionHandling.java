import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter 2 numbers : ");
			
            String input1 = sc.next();
            int num1 = Integer.parseInt(input1);
            
            String input2 = sc.next();
            int num2 = Integer.parseInt(input2);
            
			float division = num1/num2;
			System.out.println("Division of 2 numbers is "+ division);
		}
		
		catch(NumberFormatException e){
			System.out.println("The given input is not an integer!");
		}
		
		catch(ArithmeticException e) {
			System.out.println("Number is not divisible by ZERO!");
		}
		sc.close();
		
	}

}
