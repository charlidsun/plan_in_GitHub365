import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.sun.xml.internal.ws.api.server.Container;


public class BorderPosition extends JFrame {

	/**
	 * 边界布局管理器
	 */
	public BorderPosition(){
		setTitle("边界布局管理器");
		java.awt.Container container = getContentPane();
		getContentPane().setLayout(new BorderLayout());//设置边界布局管理器
		
		JButton buttcenter = new JButton("中间");
		getContentPane().add(buttcenter,BorderLayout.CENTER);//中间位置
		
		JButton buttabove = new JButton("上面");
		getContentPane().add(buttabove,BorderLayout.NORTH);
		
		JButton buttbelow = new JButton("下面");
		getContentPane().add(buttbelow,BorderLayout.SOUTH);
		
		JButton buttleft = new JButton("左面");
		getContentPane().add(buttleft,BorderLayout.EAST);
		
		JButton buttright = new JButton("右面");
		getContentPane().add(buttright,BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderPosition();
	}

}
