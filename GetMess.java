import java.io.File;

/*
	2015-1-25
	File 类的一些简单的方法	demo.text为测试文件，可新建测试
	charlidsun
*/

public class GetMess{
	public static void main(String[] args){
		File file = new File("./demo.txt");

		if(!file.exists()){
			System.out.println("文件不存在");	
		}else{
			System.out.println("文件名："+file.getName());
			System.out.println("长度："+file.length());
			System.out.println("路径："+file.getPath());
		}
	}

}
