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
	
	
/*****book��д�ļ�*****/
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
		BufferedWriter bufw = new BufferedWriter(fw);   //ʹ�û������еķ���������д�뵽��������
		
		for (int i = 0; i < bookArray.size(); i++) 
		{	
			bufw.write(bookArray.get(i).changeToString());         						//ʹ�û������еķ�����������ˢ�µ�Ŀ�ĵ��ļ���ȥ
			bufw.newLine(); 								//д��һ���зָ���  
		}
		bookArray.clear();
		bufw.flush();  				       				//�رջ�����,ͬʱ�ر���fw������  
        bufw.close();     
	}
/*****borrower��д�ļ�*****/	
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
		BufferedWriter bufw = new BufferedWriter(fw);   //ʹ�û������еķ���������д�뵽��������
		
		for (int i = 0; i < borrowerArray.size(); i++) 
		{	
			bufw.write(borrowerArray.get(i).changeToString());         						//ʹ�û������еķ�����������ˢ�µ�Ŀ�ĵ��ļ���ȥ
			bufw.newLine(); 								//д��һ���зָ���  
		}
		borrowerArray.clear();
		bufw.flush();  				       				//�رջ�����,ͬʱ�ر���fw������  
        bufw.close();     
	}


/*****��ʾ����ͼ��*****/	
	
	public static void displayBook()
	{
		for (int i = 0; i < bookArray.size(); i++) 
		{
			System.out.println(bookArray.get(i).toString());
		}
	}
	
/*****id����������*****/	
	  
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
/*****id����������*****/	 
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
/*****�޸�ͼ����Ϣ*****/
	 public static Book setBook(String str)
	 {
		 StringTokenizer st = new StringTokenizer(str, ",");
		 return new Book(Integer.parseInt(st.nextToken()),st.nextToken(), st.nextToken(),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Boolean.valueOf(st.nextToken()));
	 }
	 public static void amendBook(Book book)
	 {
			System.out.println("*****************************");
			System.out.println("*********1.�޸���Ϣ***********");
			System.out.println("*********2.���ָ���û�*******");
			System.out.println("*********3.������һ��*********");
			System.out.println("*****************************");
			int b = Keyboard.scanInt();
			switch(b) 
			{
				case 1:
				System.out.println("�밴�����¸�ʽ�����µ���Ϣ");
				System.out.println(book.changeToString());
				String str = Keyboard.scanStr();
				bookArray.set(bookArray.indexOf(book),setBook(str));
				System.out.println("�޸ĳɹ���");
				break;
				case 2:
					System.out.println("���������û�id");
					int i = Keyboard.scanInt();
					borrowerArray.get(i).setRecording(book);
				break;
				case 3:
				break;
			}
	 }
/*****�������*****/
	public static void addBook(int id,String name,String author,boolean available)
	{
		bookArray.add(new Book(id,name,author,available));
	}
	
	public static void addBook(int id,String name,String author,int page,int year,boolean available)
	{
		bookArray.add(new Book(id,name,author,page,year,available));
	}
	
/*****ɾ������*****/	
	public static void removeBook(int id)
	{
		for (int i = 0; i < bookArray.size(); i++)
		 {
			 if (bookArray.get(i).getId()==id) 
			 {
				 bookArray.remove(i);
				 System.out.println("ɾ���ɹ���");
				 break;
			 }
		 }
	}
	
/*****��ʾ������*****/		

	public static void displayBorrower()
	{
		for (int i = 0; i < borrowerArray.size(); i++) 
		{
			System.out.println(borrowerArray.get(i).toString());
		}
	}
	
/*****���ĺ͹黹****/
	public static void BRBook(Borrower borrower)
	{			
		System.out.println("*****************************");
		System.out.println("**********1.����ͼ��**********");
		System.out.println("**********2.�黹ͼ��**********");
		System.out.println("**********3.������һ��********");
		System.out.println("*****************************");
		
		int c = Keyboard.scanInt();
		switch(c) 
		{
			case 1:
			System.out.println("������Ҫ���ĵ��鼮id");
			int n = Keyboard.scanInt();
			try {
				borrower.setRecording(bookArray.get(n));

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("�����ɹ�");
			}
			
			break;
			
			case 2:
				System.out.println("����黹ͼ���id");
				int m = Keyboard.scanInt();
				try {
					borrower.returnBook(m);
		
				} catch (Exception e) {
					// TODO: handle exception
				}
				borrower.returnBook(m);
				System.out.println("�����ɹ�");
			break;
			
			case 3:
			break;
		}
	}
/*****��ӽ�����*****/	
	public static void addBorrower(int id,String name,String a)
	{
		borrowerArray.add(new Borrower(id,name,a));
	}

/*****ɾ��������*****/
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