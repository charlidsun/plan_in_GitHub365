import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class label_image_demo extends JFrame {

	/**
	 * 关于标签和图片组件的使用
	 */
	
	public label_image_demo(){
		Container container = getContentPane();
		setTitle("标签和图片组件");
		
		JLabel jLabel = new JLabel("我是标签组件",JLabel.CENTER);
		//URL url=AbsolutePosition.class.getResource("/Users/sunjingge/Desktop/icin.png");
		Icon icon = new ImageIcon("/Users/sunjingge/Desktop/icin.png");//图片的路径
		
		jLabel.setIcon(icon);
		jLabel.setHorizontalTextPosition(SwingConstants.LEFT);//设置图片组件与标签组件的位置
		jLabel.setOpaque(true);
		container.add(jLabel);
		setVisible(true);
		setSize(800,800);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new label_image_demo();
	}

}
