package library;



public class Book{

	private int id;
	private String name;
	private String author;
	private int page;
	private int year;
	private boolean available=true;
	

	Book(int id,String name,String author,boolean available)
	{
		this.id = id;
		this.name=name;
		this.author=author;
		this.available=available;

	}
	
	Book(int id,String name,String author,int page,int year,boolean available)
	{
		this.id = id;
		this.name=name;
		this.author=author;
		this.page=page;
		this.year=year;

	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getPage() {
		return page;
	}

	public int getYear() {
		return year;
	}

	public boolean getAvailable()
	{
		return this.available;
	}
	public String toString()
	{
		return "《"+this.name+"》"+"-"+this.author;
	}
	
	public void showBook()
	{
		System.out.println("书名："+this.name);
		System.out.println("作者："+this.author);
		System.out.println("页数："+this.page);
		System.out.println("年限："+this.year);
		System.out.println("是否可借："+this.available);
	}
	
	public String changeToString()
	{
		return this.id+","+this.name+","+this.author+","+this.page+","+this.year+","+this.available;
	}

}
