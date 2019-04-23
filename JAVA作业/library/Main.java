package library;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		boolean f = true;
		while (f)
		{
			System.out.println("*****************************");
			System.out.println("********图书馆管理系统********");
			System.out.print("**1.图书管理**");
			System.out.println("**2.借阅者管理**");
			System.out.println("**3.关闭系统*****************");
			System.out.println("*****************************");
			
			int cmd = Keyboard.scanInt();
			switch (cmd)
			{
			case 1:
				LibrarySystem.runBook();
				break;
			case 2:
				LibrarySystem.runBorrower();
				break;
			case 3:
				f = false;
				break;
			default:
				System.out.println("没有此操作");
			break;
			}
		}
		
	}

}
