package library;

import java.util.Scanner;

public class Keyboard {
	static int scanInt()
	{
		int scan = new Scanner(System.in).nextInt();
		
		return scan;
	}
	static String scanStr()
	{
		String str = new Scanner(System.in).next();
		
		return str;
	}
}