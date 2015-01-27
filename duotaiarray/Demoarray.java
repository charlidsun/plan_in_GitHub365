
public class Demoarray {

	public static void main(String[] args){
		Drawdemo[] textdraw = new Drawdemo[3];
		
		textdraw[0]=new Square();
		textdraw[1]=new Rectangle();
		textdraw[2]=new Para();
		
		for(Drawdemo obj: textdraw){
			obj.draw();
		}
	}
}
