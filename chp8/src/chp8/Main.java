package chp8;

public class Main {
	public static void main(String[] args) {
		try {
			int data=50/0;
		} 
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("code exc succesfully");
		}
	}
}
