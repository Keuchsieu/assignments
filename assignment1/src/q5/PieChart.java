/**
 * 
 */
package q5;

/**
 * @author A00985057 Yuqing Qiu
 *
 */
import javax.swing.*;
import java.awt.*;
public class PieChart extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5890104607890453878L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Project 5 Pie Chart");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(300,300));
		panel.setBackground(Color.white);
		//program body
		
		//===
		frame.getContentPane().add(panel);
		frame.pack();;
		frame.setVisible(true);
	}

}
