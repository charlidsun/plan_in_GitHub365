import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class JPaneldemo extends JFrame {

	/**
	 * JPlanel面板，面板也是容器，里面可以添加多个布局管理器
	 */
	
	public JPaneldemo(){
		Container container = getContentPane();
		container.setLayout(new GridLayout(2,2, 10, 10));

		JPanel jPanel1 = new JPanel(new GridLayout(1,3,10,10));
		JPanel jPanel2 = new JPanel(new GridLayout(1,2,10,10));
		JPanel jPanel3 = new JPanel(new GridLayout(1,2,10,10));
		JPanel jPanel4 = new JPanel(new GridLayout(2,1,10,10));
		
		jPanel1.add(new JButton("1")); //往面板中添加按钮
		jPanel1.add(new JButton("2"));
		jPanel1.add(new JButton("3"));
		jPanel2.add(new JButton("4"));
		jPanel2.add(new JButton("5"));
		jPanel3.add(new JButton("6"));
		jPanel3.add(new JButton("7"));
		jPanel4.add(new JButton("8"));
		jPanel4.add(new JButton("9"));
		
		container.add(jPanel1);
		container.add(jPanel2);
		container.add(jPanel3);
		container.add(jPanel4);

		setVisible(true);
		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JPaneldemo();
	}

}
