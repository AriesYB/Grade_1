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
		return "��"+this.name+"��"+"-"+this.author;
	}
	
	public void showBook()
	{
		System.out.println("������"+this.name);
		System.out.println("���ߣ�"+this.author);
		System.out.println("ҳ����"+this.page);
		System.out.println("���ޣ�"+this.year);
		System.out.println("�Ƿ�ɽ裺"+this.available);
	}
	
	public String changeToString()
	{
		return this.id+","+this.name+","+this.author+","+this.page+","+this.year+","+this.available;
	}

}
