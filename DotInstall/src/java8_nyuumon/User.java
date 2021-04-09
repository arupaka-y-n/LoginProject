package java8_nyuumon;

interface Printable {
	double VERSION = 1.2;
	void print();
	public default void getInfo() {
		System.out.println("I/F ver." + Printable.VERSION);
	}
	
}

class User implements Printable {
	@Override
	public void print() {
		System.out.println("Now printing user profile...");
	}
}
