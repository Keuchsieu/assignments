/**
 * 
 */
package q1;

/**
 * @author A00985057 Yuqing Qiu
 *
 */
import java.util.Scanner;
public class Change {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double money, truncate;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the amount of money:");
		money = scan.nextDouble();
		scan.close();
		truncate = money*100;
		int remain = (int)(money*100);
		int ten = remain/1000;
		remain = remain%1000;
		int fiv = remain/500;
		remain = remain%500;
		int two = remain/200;
		remain = remain%200;
		int one = remain/100;
		remain = remain%100;
		int qua = remain/25;
		remain = remain%25;
		int dim = remain/10;
		remain = remain%10;
		int nic = remain/5;
		remain = remain%5;
		int pen = remain/1;
		remain = remain%1;
		if (truncate-(int)truncate>0){
			System.out.println("wrong money amount");
		}
		else{
			System.out.println(ten+" ten dollar bills");
			System.out.println(fiv+" five dollar bills");
			System.out.println(two+" two dollar coins");
			System.out.println(one+" one dollar coins");
			System.out.println(qua+" quaters");
			System.out.println(dim+" dimes");
			System.out.println(nic+" nickles");
			System.out.println(pen+" pennies");
		}
	}

}
