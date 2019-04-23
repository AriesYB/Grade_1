package library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Database {

	private static ArrayList<Book> bookArray = new ArrayList<Book>();
	private static ArrayList<Borrower> borrowerArray = new ArrayList<Borrower>();
	static ArrayList<String> recordings = new ArrayList<String>  ();
	
	
/*****book读写文件*****/
	public static void loadBook(String url) throws IOException
	{
	
		FileReader fr = new FileReader(url);
		BufferedReader bufr = new BufferedReader(fr);
		
		String st= null;
		while ((st=bufr.readLine())!=null)
		{
			StringTokenizer str = new StringTokenizer(st, ",");
			addBook(Integer.parseInt(str.nextToken()),str.nextToken(), str.nextToken(),Integer.parseInt(str.nextToken()),Integer.parseInt(str.nextToken()),Boolean.valueOf(str.nextToken()));
		} 
		
		bufr.close();
		
	}

	public static void writeBook(String url) throws IOException
	{
		
		FileWriter fw = new FileWriter(url);
		BufferedWriter bufw = new BufferedWriter(fw);   //使用缓冲区中的方法将数据写入到缓冲区中
		
		for (int i = 0; i < bookArray.size(); i++) 
		{	
			bufw.write(bookArray.get(i).changeToString());         						//使用缓冲区中的方法，将数据刷新到目的地文件中去
			bufw.newLine(); 								//写入一个行分隔符  
		}
		bookArray.clear();
		bufw.flush();  				       				//关闭缓冲区,同时关闭了fw流对象  
        bufw.close();     
	}
/*****borrower读写文件*****/	
	public static void loadBorrower(String url) throws IOException
	{
		FileReader fr = new FileReader(url);
		BufferedReader bufr = new BufferedReader(fr);
		
		String st= null;
		while ((st=bufr.readLine())!=null)
		{
			StringTokenizer str = new StringTokenizer(st, ",");
			addBorrower(Integer.parseInt(str.nextToken()),str.nextToken(),str.nextToken());
		} 
		
		bufr.close();

	}
	
	public static void writeBorrower(String url) throws IOException
	{
		
		FileWriter fw = new FileWriter(url);
		BufferedWriter bufw = new BufferedWriter(fw);   //使用缓冲区中的方法将数据写入到缓冲区中
		
		for (int i = 0; i < borrowerArray.size(); i++) 
		{	
			bufw.write(borrowerArray.get(i).changeToString());         						//使用缓冲区中的方法，将数据刷新到目的地文件中去
			bufw.newLine(); 								//写入一个行分隔符  
		}
		borrowerArray.clear();
		bufw.flush();  				       				//关闭缓冲区,同时关闭了fw流对象  
        bufw.close();     
	}


/*****显示所有图书*****/	
	
	public static void displayBook()
	{
		for (int i = 0; i < bookArray.size(); i++) 
		{
			System.out.println(bookArray.get(i).toString());
		}
	}
	
/*****id或书名搜索*****/	
	  
	 public static Book getBook(int id)
	 {
		 for (int i = 0; i < bookArray.size(); i++)
		 {
			 if (bookArray.get(i).getId()==id) 
			 {
				 return bookArray.get(i);
			 }
			 if (bookArray.size()==i) 
			 {
				break;
			 }
		 }
		return null;
	 }
	 
	 public static Book getBook(String name)
	 {
		 for (int i = 0; i < bookArray.size(); i++)
		 {
			 if (bookArray.get(i).getName().equals(name)) 
			 {
				return bookArray.get(i);
			 }
			 if (bookArray.size()==i) 
			 {
				break;
			 }
		 }
		 return null;
	 }
/*****id或姓名搜索*****/	 
	 public static Borrower getBorrower(int id)
	 {
		 for (int i = 0; i < borrowerArray.size(); i++)
		 {
			 if (borrowerArray.get(i).getId()==id) 
			 {
				 return borrowerArray.get(i);
			 }
			 if (borrowerArray.size()==i) 
			 {
				break;
			 }
		 }
		 return null;
	 }
	 public static Borrower getBorrower(String name)
	 {
		 for (int i = 0; i < borrowerArray.size(); i++)
		 {
			 if (borrowerArray.get(i).getName().equals(name)) 
			 {
				return borrowerArray.get(i);
			 }
			 if (borrowerArray.size()==i) 
			 {
				break;
			 }
		 }
		 return null;
	 }
/*****修改图书信息*****/
	 public static Book setBook(String str)
	 {
		 StringTokenizer st = new StringTokenizer(str, ",");
		 return new Book(Integer.parseInt(st.nextToken()),st.nextToken(), st.nextToken(),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Boolean.valueOf(st.nextToken()));
	 }
	 public static void amendBook(Book book)
	 {
			System.out.println("*****************************");
			System.out.println("*********1.修改信息***********");
			System.out.println("*********2.借给指定用户*******");
			System.out.println("*********3.返回上一级*********");
			System.out.println("*****************************");
			int b = Keyboard.scanInt();
			switch(b) 
			{
				case 1:
				System.out.println("请按照如下格式输入新的信息");
				System.out.println(book.changeToString());
				String str = Keyboard.scanStr();
				bookArray.set(bookArray.indexOf(book),setBook(str));
				System.out.println("修改成功！");
				break;
				case 2:
					System.out.println("输入借给的用户id");
					int i = Keyboard.scanInt();
					borrowerArray.get(i).setRecording(book);
				break;
				case 3:
				break;
			}
	 }
/*****添加新书*****/
	public static void addBook(int id,String name,String author,boolean available)
	{
		bookArray.add(new Book(id,name,author,available));
	}
	
	public static void addBook(int id,String name,String author,int page,int year,boolean available)
	{
		bookArray.add(new Book(id,name,author,page,year,available));
	}
	
/*****删除旧书*****/	
	public static void removeBook(int id)
	{
		for (int i = 0; i < bookArray.size(); i++)
		 {
			 if (bookArray.get(i).getId()==id) 
			 {
				 bookArray.remove(i);
				 System.out.println("删除成功！");
				 break;
			 }
		 }
	}
	
/*****显示借阅者*****/		

	public static void displayBorrower()
	{
		for (int i = 0; i < borrowerArray.size(); i++) 
		{
			System.out.println(borrowerArray.get(i).toString());
		}
	}
	
/*****借阅和归还****/
	public static void BRBook(Borrower borrower)
	{			
		System.out.println("*****************************");
		System.out.println("**********1.借阅图书**********");
		System.out.println("**********2.归还图书**********");
		System.out.println("**********3.返回上一级********");
		System.out.println("*****************************");
		
		int c = Keyboard.scanInt();
		switch(c) 
		{
			case 1:
			System.out.println("请输入要借阅的书籍id");
			int n = Keyboard.scanInt();
			try {
				borrower.setRecording(bookArray.get(n));

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("操作成功");
			}
			
			break;
			
			case 2:
				System.out.println("输入归还图书的id");
				int m = Keyboard.scanInt();
				try {
					borrower.returnBook(m);
		
				} catch (Exception e) {
					// TODO: handle exception
				}
				borrower.returnBook(m);
				System.out.println("操作成功");
			break;
			
			case 3:
			break;
		}
	}
/*****添加借阅者*****/	
	public static void addBorrower(int id,String name,String a)
	{
		borrowerArray.add(new Borrower(id,name,a));
	}

/*****删除借阅者*****/
	public static void removeBorrower(int id)
	{
		for (int i = 0; i < borrowerArray.size(); i++)
		 {
			 if (borrowerArray.get(i).getId()==id) 
			 {
				 borrowerArray.remove(i);
				 break;
			 }
		 }
	}
}