package java8_nyuumon;
import java8_nyuumon.User;
//import java8_nyuumon.AdminUser;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}


public class Main {
	
	public static void div(int a, int b) {
		try {
			if (b < 0) {
				throw new MyException("not minus!");
			}
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} catch(MyException e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("---end---");
		}
		
	}
	
	public static void main(String[] args) {
		div(3, 0);
		div(5, -2);
	
	}
}
