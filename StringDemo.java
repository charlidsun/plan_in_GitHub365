
public class StringDemo{
	public static void main(String[] args){
		
		//查找字符串的索引位置
		String strdemo="abc dd dd dd abc kdd jdke dd";
		int ret = 0;
		int index = -1;
		String findstr="dd";

		while(ret!=-1){
			ret=strdemo.indexOf(findstr,index+1);
			index=ret;
			if(ret>=0)
				System.out.println("字符串 "+findstr+" 存在于 "+strdemo+" 位置为 "+ret);
		}

		//连接字符串	
		String oldstr="hello";
		String newstr=" world";
		String hello = oldstr+newstr;

		System.out.println(hello);

		//判断字符串是否相等 equals方法
		boolean judge = oldstr.equals(newstr);

		System.out.println("true 相等 false 不想等："+judge);

		//字符串的比较 compareTo
		String compa = "demo";
		String compb = "demo";
		int compstr=oldstr.compareTo(newstr);
		int compstl=compa.compareTo(compb);

		System.out.println("0 相同  非零 不想同："+compstr);
		System.out.println("0 相同 非零 不想同："+compstl);

		//求字符串的长度 length
		int strlength = compa.length();
		System.out.println(compa+"的长度："+strlength);

		//大小写转换 toLowerCase toUpperCase
		System.out.println(oldstr+" 转换 "+oldstr.toLowerCase());
		System.out.println(newstr+" 转换 "+newstr.toUpperCase());
	}
}
