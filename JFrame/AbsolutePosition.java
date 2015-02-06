import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.sun.xml.internal.ws.api.server.Container;


public class AbsolutePosition extends JFrame{

	/**
	 * 绝对布局管理器
	 */
	
	public AbsolutePosition(){
		setTitle("绝对布局管理器");
		getContentPane().setLayout(null);//使窗口取消布局管理器的使用
		setBounds(0, 0, 200, 200);
		java.awt.Container container=getContentPane();//创建容器对象
		JButton butt1 = new JButton("按钮1");
		JButton butt2 = new JButton("按钮2");
		butt1.setBounds(10, 30, 80, 30);
		butt2.setBounds(10, 70,80, 30);
		container.add(butt2);
		container.add(butt1);//添加到容器里面
		
		setVisible(true);//可见
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AbsolutePosition();
	}

}
