/**
 * 
 */
package q3;

/**
 * @author A00985057 Yuqing Qiu
 *
 */
import java.util.Scanner;
public class Arithmetic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float num1,num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("the first float:");
		num1 = scan.nextFloat();
		System.out.println("the second float:");
		num2 = scan.nextFloat();
		scan.close();
		
		System.out.println("their sumary is:\n"+(num1+num2));
		System.out.println("difference of first number subtracts second number is:\n"+(num1-num2));
		System.out.println("the quotient of first number divided by second number is:\n"+(num1/num2));
		System.out.println("the product of them is:\n"+(num1*num2));
	}

}
