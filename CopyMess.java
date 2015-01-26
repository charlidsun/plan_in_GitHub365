/*
	2015-1-25
	文本的复制，判断目标文件是否存在。
	scanner 标准输入
	charlidsun
*/

import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyMess{
	public static void main(String[] args){
		
		File o_file = new File("./demo.txt");
		File n_file = new File("./copydemo.txt");


		if(!o_file.exists()){
			System.out.println("源文件不存在!");
		}else{
			if(n_file.exists()){
				System.out.println("复制文件已经存在,是否覆盖 y/n?");
				Scanner judge = new Scanner(System.in);
				String name = judge.nextLine();
				if(name.equals("y") || name.equals("Y")){
					byte[] tmp = new byte[512];
					int res = -1;
					try{
						FileInputStream o_txt = new FileInputStream(o_file);
						FileOutputStream n_txt = new FileOutputStream(n_file);
						n_file.createNewFile();						
						while((res = o_txt.read(tmp)) > 0){
							n_txt.write(tmp,0,res);
						}

						o_txt.close();
						n_txt.close();
						System.out.println("文件复制成功");

					}catch(Exception e){
						e.printStackTrace();
					}
				}else{
					System.out.println("退出");
				}
			}

		}
	}
}
