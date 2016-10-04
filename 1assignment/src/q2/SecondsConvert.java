/**
 * 
 */
package q2;

/**
 * @author A00985057 Yuqing Qiu
 *
 */
import java.util.Scanner;
public class SecondsConvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input seconds to be convert:");
		int sec = scan.nextInt();
		scan.close();
		int hour = sec/3600;
		int rem = sec%3600;
		int minute = rem/60;
		rem = rem%60;
		
		System.out.println(sec+" seconds is "+hour+":"+minute+":"+rem);
	}

}
