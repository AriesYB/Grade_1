package library;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		boolean f = true;
		while (f)
		{
			System.out.println("*****************************");
			System.out.println("********ͼ��ݹ���ϵͳ********");
			System.out.print("**1.ͼ�����**");
			System.out.println("**2.�����߹���**");
			System.out.println("**3.�ر�ϵͳ*****************");
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
				System.out.println("û�д˲���");
			break;
			}
		}
		
	}

}
