import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;


public class JScrollPane extends JFrame {

	/**
	 * 面板的实现
	 */
	
	public JScrollPane(){
		Container container = getContentPane();
		JTextArea area = new JTextArea(20,50);//文本区域组件
		javax.swing.JScrollPane jScrollPane = new javax.swing.JScrollPane(area);
		container.add(jScrollPane);
		
		setTitle("带文字的编辑器");
		setVisible(true);
		setSize(200,200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JScrollPane();
	}

}
