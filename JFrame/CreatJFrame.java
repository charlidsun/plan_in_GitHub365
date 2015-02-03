import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.javafx.event.EventQueue;


public class CreatJFrame extends JFrame {

	/**
	 * 创建一个窗口组件
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatJFrame frame = new CreatJFrame();
		frame.setVisible(true);
	}
	
	public CreatJFrame(){
		super();
		setBounds(100, 200, 200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JLabel jLabel = new JLabel();
		jLabel.setText("一个窗口");
		getContentPane().add(jLabel,BorderLayout.CENTER);
	}

}
