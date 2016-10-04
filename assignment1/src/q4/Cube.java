/**
 * 
 */
package q4;

/**
 * @author A00985057 Yuqing Qiu
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class Cube {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please input the length of cube's side:");
		double side = scan.nextDouble();
		scan.close();
		System.out.println("Volume of that cube is:\n"+Math.pow(side,3));
		System.out.println("Surface area of that cube is:\n"+
		6*Math.pow(side, 2));
	}

}
