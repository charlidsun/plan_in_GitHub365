
public class Log{
	private String name;
	private int age;
	private int source;

	public Log(){
		name = "default";
		age = 12;
		source = 98;
	}

	public Log(String name){
		this.name=name;
	}

	public Log(String name,int age,int source){
		this.name=name;
		this.age=age;
		this.source = source;
	}

	public void Lprint(){
		System.out.println("姓名 "+name);		
		System.out.println("年龄 "+age);		
		System.out.println("分数 "+source);		
	}

	public static void main(String[] args){
		Log stud = new Log();
		Log str = new Log("sun");
		Log strr = new Log("jack",10,100);

		stud.Lprint();
		str.Lprint();
		strr.Lprint();

	}
}






