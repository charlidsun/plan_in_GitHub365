
public class DemoThread extends Thread {

	/**
	 * 继承thread的线程
	 */
	String name="jack";
	int i = 10;
	public DemoThread(String name){
		this.name=name;
	}
	
	public void run(){
		while(true){
			System.out.println(name+"写了一篇文章");
			System.out.println(name+"画了一副图片");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread str=new DemoThread("jack");
		Thread res=new DemoThread("bob");
		str.start();
		res.start();
	}

}
