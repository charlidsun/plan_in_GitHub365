

public class DemoRunnalbe{

	/**
	 * Runnable 的线程
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demodemoaa str = new Demodemoaa("jack");
		Demodemoaa res = new Demodemoaa("james");
		Thread a1 = new Thread(str);
		Thread a2 = new Thread(res);
		a1.start();
		a2.start();
	}

}
class Demodemoaa implements Runnable{
	
	String name;
	
	public Demodemoaa(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("text"+name);
			System.out.println("demo"+name);
		}
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
