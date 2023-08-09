package chp8;

public class Main2 {
	void meth() {
		int data = 50 / 0;
	}

	void meth1() {
		meth();
	}
	
	void meth2() {
		try {
			meth1();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Main2 main= new Main2();
		main.meth2();
	}
}
