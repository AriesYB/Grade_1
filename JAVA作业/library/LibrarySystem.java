package library;

import java.io.IOException;
import java.util.StringTokenizer;

public class LibrarySystem {
/*****ͼ�����
 * @throws IOException *****/
	public static void runBook() throws IOException
	{	
		
		/*****��ͼ���ļ�*****/
		Database.loadBook("C://Users/����Ա/Desktop/Book.txt");    
		boolean flag = true;
		while (flag)
		{
	
			printMenuBook();
			
			int cmd = Keyboard.scanInt();
			switch(cmd) 
			{
			case 1:
				System.out.println("******1.��������******");
				System.out.println("******2.id����******");
				int a = Keyboard.scanInt();
				switch(a) 
				{
					case 1:
						System.out.println("����������");
						String str = Keyboard.scanStr();
						try {
							Database.getBook(str).showBook();
							//�޸���Ϣ
							Database.amendBook(Database.getBook(str));

						} catch (NullPointerException e) {
							// TODO: handle exception
							System.out.println("δ�ҵ�");//���������׳��쳣
						}
						break;
					case 2:
						System.out.println("������id");
						int n = Keyboard.scanInt();
						try {

							Database.getBook(n).showBook();
							//�޸���Ϣ
							Database.amendBook(Database.getBook(n));
						} catch (NullPointerException e) {
							// TODO: handle exception
							System.out.println("δ�ҵ�");//���������׳��쳣
						}
						break;
				}

				break;
				
			case 2:
				System.out.println("������Ҫ��ӵ�ͼ����Ϣ��������id�����������߲���Ӣ�Ķ��Ÿ�����");
				String Str = Keyboard.scanStr();
				StringTokenizer str = new StringTokenizer(Str, ",");
				Database.addBook(Integer.parseInt(str.nextToken()), str.nextToken(),str.nextToken(),Boolean.valueOf(str.nextToken()));
				
				System.out.println("�����ɣ�");
				break;
			case 3:
					Database.displayBook();
					break;
			case 4:
				System.out.println("������Ҫɾ����ͼ��id");
				int id = Keyboard.scanInt();
				System.out.println("����Ҫɾ�����飺"+Database.getBook(id).toString());
				System.out.println("1.ȷ��  2.ȡ��");
				int i = Keyboard.scanInt();
				if (i==1)
				{
					Database.removeBook(id);
				}
				break;
			
			case 5:
				Database.writeBook("C://Users/����Ա/Desktop/Book.txt");
				flag = false;
				break;
			default:
				System.out.println("û�д˲���");
				break;
			}
		}
	}
	
	
	private static void printMenuBook()
	{
		System.out.println("*****************************");
		System.out.println("*********ͼ�����ģ��*********");
		System.out.print("**1.����ͼ��  ");
		System.out.println("  2.���ͼ��**");
		System.out.print("**3.��ʾͼ��  ");
		System.out.println("  4.ɾ��ͼ��**");
		System.out.println("**5.���ز˵�******************");
		System.out.println("*****************************");
	}

	
/*****�����߹���
 * @throws IOException *****/
	public static void runBorrower() throws IOException
	{
		
		/*****���������ļ�*****/
		Database.loadBorrower("C://Users/����Ա/Desktop/Borrower.txt");
		boolean flag = true;
		while (flag)
		{
			printMenuBorrower();
			
			int cmd = Keyboard.scanInt();
			switch(cmd) 
			{
			case 1:
				
				System.out.println("******1.��������******");
				System.out.println("******2.id����******");
				int a = Keyboard.scanInt();
				switch(a) 
				{
					case 1:
						System.out.println("����������");
						String str = Keyboard.scanStr();
						try {
							System.out.println(Database.getBorrower(str).changeToString());
							StringTokenizer s = new StringTokenizer(Database.getBorrower(str).getRecording(),".");
							System.out.println("�ѽ�:");
							System.out.println("��ս�����ƽ��");
							Database.BRBook(Database.getBorrower(str));
							while(s.hasMoreElements())
							{
								Database.recordings.add(s.nextToken());
								System.out.println(Database.getBook(Integer.parseInt(s.nextToken())).toString());
							}
				
							
							//���Ĺ���
							
						} catch (NullPointerException e) {
							// TODO: handle exception
							System.out.println(" ");//���������׳��쳣
						}
						break;
					case 2:
						System.out.println("������id");
						int n = Keyboard.scanInt();
						System.out.println("�ѽ�:");
						System.out.println("��ս�����ƽ��");
						System.out.println("��ͯ�꡷");
						Database.BRBook(Database.getBorrower(n));
						try {
							System.out.println(Database.getBorrower(n).changeToString());
							StringTokenizer s = new StringTokenizer(Database.getBorrower(n).getRecording(),".");
							while(s.hasMoreTokens())
							{
								Database.recordings.add(s.nextToken());
								System.out.println(Database.getBook(Integer.parseInt(s.nextToken())).toString());
							}
							//���Ĺ���
						} catch (NullPointerException e) {
							// TODO: handle exception
							System.out.println("δ�ҵ�");//���������׳��쳣
						}
						break;
				}
				break;
			case 2:
				System.out.println("������Ҫ��ӵĽ�������Ϣ��������id����������Ӣ�Ķ��Ÿ�����");
				String Str = Keyboard.scanStr();
				StringTokenizer str = new StringTokenizer(Str, ",");
				Database.addBorrower(Integer.parseInt(str.nextToken()), str.nextToken(),str.nextToken());
				System.out.println("�����ɣ�");
				break;
			
			case 3:
				Database.displayBorrower();
				break;
			case 4:
				System.out.println("������Ҫɾ���Ľ�����id");
				int id = Keyboard.scanInt();
				System.out.println("����Ҫɾ����λ�����ߣ�"+Database.getBorrower(id).toString());
				System.out.println("1.ȷ��  2.ȡ��");
				int i = Keyboard.scanInt();
				if (i==1)
				{
					Database.removeBorrower(id);
					System.out.println("ɾ���ɹ�");
				}
				break;
			
			case 5:
				Database.writeBorrower("C://Users/����Ա/Desktop/Borrower.txt");
				flag = false;
				break;
			default:
				System.out.println("û�д˲���");
				break;
			}
		}
	}
	
	
	private static void printMenuBorrower()
	{
		System.out.println("*****************************");
		System.out.println("*********���Ĺ���ģ��*********");
		System.out.print("**1.�����߲�ѯ  ");
		System.out.println("  2.��ӽ�����**");
		System.out.print("**3.��ʾ������  ");
		System.out.println("  4.�Ƴ�������**");
		System.out.println("**5.���ز˵�*****************");
		System.out.println("*****************************");
	}
}
