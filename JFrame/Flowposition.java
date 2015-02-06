import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Flowposition extends JFrame {

	/**
	 * 流布局管理器
	 */
	
	public Flowposition(){
		setTitle("流布局管理器");
		Container container = getContentPane();
		//设置流布局管理器，布局为左对齐，水平间隔和垂直间隔为10
		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		for(int i=1;i<10;i++){
			container.add(new JButton("按钮"+i));
		}
		setSize(300, 200);//窗体大小
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Flowposition();
	}

}
