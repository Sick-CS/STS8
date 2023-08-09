package chp8;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}

public class Main3 {
	public static void main(String[] args) {
		try {
			throw new MyException("exception");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
