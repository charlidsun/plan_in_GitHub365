
public class Book{
	private String name;
	private String author;
	private int price;

	public Book(String name,String author,int price){
		this.name=name;
		this.author=author;
		this.price=price;
	}
	
	public String getName(){
		return name;
	}

	public String getAuthor(){
		return author;
	}

	public int getPrice(){
		return price;
	}

	public static void main(String[] args){
		Book res = new Book("Mac OS","char",99);

		System.out.println("res ＝ "+res);
		System.out.println("name ＝ "+res.getName());
		System.out.println("author ＝ "+res.getAuthor());
		System.out.println("price ＝ "+res.getPrice());
	}
}
