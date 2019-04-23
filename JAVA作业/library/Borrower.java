package library;


public class Borrower {

	private String name;
	private int id;
	private  String recording;

	
	Borrower(int id,String name,String s)
	{
		this.id=id;
		this.name=name;
		this.recording=s;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	public String toString()
	{
		return this.name+"-"+this.id;
	}
	
	public String getRecording()
	{
		return this.recording;
	}
	
	public void setRecording(Book book)
	{
		try {
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("该用户可借阅图书已达到上限！");
		}
	}
	
	public void returnBook(int id)
	{
		
	try {
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("该用户可借阅图书已达到上限！");
		}
	}
	public String changeToString()
	{
		return this.id+","+this.name+","+this.recording;
	}
}
