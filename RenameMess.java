
/**
 * 2015-1-25
 * 文件重命名
 * charlidsun
 */

import java.io.File;

public class RenameMess {
	public void rename(String o_file,String n_file){	

		File o_path = new File(o_file);
		File n_path = new File(n_file);

		if(!o_path.exists()){
			System.out.println("文件不存在");

		}else{
			if(n_path.exists()){
				System.out.println("重命名文件已存在");		
			}else {
				o_path.renameTo(n_path);
				System.out.println("成功");
			}
		}

	}

	public static void main(String[] args) {


		RenameMess str = new RenameMess();

		str.rename("./demo.txt", "./redemo");

	}

}

