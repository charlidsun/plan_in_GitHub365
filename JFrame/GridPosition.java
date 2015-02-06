import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class GridPosition extends JFrame {

	/**
	 * 网格布局管理器
	 */
	
	public GridPosition(){
		setTitle("网格布局管理器");
		
		//设置布局管理器
		GridLayout gridLayout = new GridLayout(0, 3, 2, 2);
		Container container = getContentPane();
		getContentPane().setLayout(gridLayout);
		
		//添加按钮
		for(int i=1;i<10;i++){
			container.add(new JButton("表格按钮"+i));
		}
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridPosition();
	}

}
