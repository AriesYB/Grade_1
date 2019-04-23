package library;

import java.io.IOException;
import java.util.StringTokenizer;

public class LibrarySystem {
/*****图书管理
 * @throws IOException *****/
	public static void runBook() throws IOException
	{	
		
		/*****读图书文件*****/
		Database.loadBook("C://Users/管理员/Desktop/Book.txt");    
		boolean flag = true;
		while (flag)
		{
	
			printMenuBook();
			
			int cmd = Keyboard.scanInt();
			switch(cmd) 
			{
			case 1:
				System.out.println("******1.书名搜索******");
				System.out.println("******2.id搜索******");
				int a = Keyboard.scanInt();
				switch(a) 
				{
					case 1:
						System.out.println("请输入书名");
						String str = Keyboard.scanStr();
						try {
							Database.getBook(str).showBook();
							//修改信息
							Database.amendBook(Database.getBook(str));

						} catch (NullPointerException e) {
							// TODO: handle exception
							System.out.println("未找到");//搜索不到抛出异常
						}
						break;
					case 2:
						System.out.println("请输入id");
						int n = Keyboard.scanInt();
						try {

							Database.getBook(n).showBook();
							//修改信息
							Database.amendBook(Database.getBook(n));
						} catch (NullPointerException e) {
							// TODO: handle exception
							System.out.println("未找到");//搜索不到抛出异常
						}
						break;
				}

				break;
				
			case 2:
				System.out.println("请输入要添加的图书信息（必须有id，书名，作者并以英文逗号隔开）");
				String Str = Keyboard.scanStr();
				StringTokenizer str = new StringTokenizer(Str, ",");
				Database.addBook(Integer.parseInt(str.nextToken()), str.nextToken(),str.nextToken(),Boolean.valueOf(str.nextToken()));
				
				System.out.println("添加完成！");
				break;
			case 3:
					Database.displayBook();
					break;
			case 4:
				System.out.println("请输入要删除的图书id");
				int id = Keyboard.scanInt();
				System.out.println("您将要删除该书："+Database.getBook(id).toString());
				System.out.println("1.确认  2.取消");
				int i = Keyboard.scanInt();
				if (i==1)
				{
					Database.removeBook(id);
				}
				break;
			
			case 5:
				Database.writeBook("C://Users/管理员/Desktop/Book.txt");
				flag = false;
				break;
			default:
				System.out.println("没有此操作");
				break;
			}
		}
	}
	
	
	private static void printMenuBook()
	{
		System.out.println("*****************************");
		System.out.println("*********图书管理模块*********");
		System.out.print("**1.搜索图书  ");
		System.out.println("  2.添加图书**");
		System.out.print("**3.显示图书  ");
		System.out.println("  4.删除图书**");
		System.out.println("**5.返回菜单******************");
		System.out.println("*****************************");
	}

	
/*****借阅者管理
 * @throws IOException *****/
	public static void runBorrower() throws IOException
	{
		
		/*****读借阅者文件*****/
		Database.loadBorrower("C://Users/管理员/Desktop/Borrower.txt");
		boolean flag = true;
		while (flag)
		{
			printMenuBorrower();
			
			int cmd = Keyboard.scanInt();
			switch(cmd) 
			{
			case 1:
				
				System.out.println("******1.姓名搜索******");
				System.out.println("******2.id搜索******");
				int a = Keyboard.scanInt();
				switch(a) 
				{
					case 1:
						System.out.println("请输入姓名");
						String str = Keyboard.scanStr();
						try {
							System.out.println(Database.getBorrower(str).changeToString());
							StringTokenizer s = new StringTokenizer(Database.getBorrower(str).getRecording(),".");
							System.out.println("已借:");
							System.out.println("《战争与和平》");
							Database.BRBook(Database.getBorrower(str));
							while(s.hasMoreElements())
							{
								Database.recordings.add(s.nextToken());
								System.out.println(Database.getBook(Integer.parseInt(s.nextToken())).toString());
							}
				
							
							//借阅管理
							
						} catch (NullPointerException e) {
							// TODO: handle exception
							System.out.println(" ");//搜索不到抛出异常
						}
						break;
					case 2:
						System.out.println("请输入id");
						int n = Keyboard.scanInt();
						System.out.println("已借:");
						System.out.println("《战争与和平》");
						System.out.println("《童年》");
						Database.BRBook(Database.getBorrower(n));
						try {
							System.out.println(Database.getBorrower(n).changeToString());
							StringTokenizer s = new StringTokenizer(Database.getBorrower(n).getRecording(),".");
							while(s.hasMoreTokens())
							{
								Database.recordings.add(s.nextToken());
								System.out.println(Database.getBook(Integer.parseInt(s.nextToken())).toString());
							}
							//借阅管理
						} catch (NullPointerException e) {
							// TODO: handle exception
							System.out.println("未找到");//搜索不到抛出异常
						}
						break;
				}
				break;
			case 2:
				System.out.println("请输入要添加的借阅者信息（必须有id，姓名并以英文逗号隔开）");
				String Str = Keyboard.scanStr();
				StringTokenizer str = new StringTokenizer(Str, ",");
				Database.addBorrower(Integer.parseInt(str.nextToken()), str.nextToken(),str.nextToken());
				System.out.println("添加完成！");
				break;
			
			case 3:
				Database.displayBorrower();
				break;
			case 4:
				System.out.println("请输入要删除的借阅者id");
				int id = Keyboard.scanInt();
				System.out.println("您将要删除这位借阅者："+Database.getBorrower(id).toString());
				System.out.println("1.确认  2.取消");
				int i = Keyboard.scanInt();
				if (i==1)
				{
					Database.removeBorrower(id);
					System.out.println("删除成功");
				}
				break;
			
			case 5:
				Database.writeBorrower("C://Users/管理员/Desktop/Borrower.txt");
				flag = false;
				break;
			default:
				System.out.println("没有此操作");
				break;
			}
		}
	}
	
	
	private static void printMenuBorrower()
	{
		System.out.println("*****************************");
		System.out.println("*********借阅管理模块*********");
		System.out.print("**1.借阅者查询  ");
		System.out.println("  2.添加借阅者**");
		System.out.print("**3.显示借阅者  ");
		System.out.println("  4.移除借阅者**");
		System.out.println("**5.返回菜单*****************");
		System.out.println("*****************************");
	}
}
