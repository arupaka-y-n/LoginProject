package java8_nyuumon;

public class Parent {
	private String isbn;
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	protected void printInfo() {
		System.out.print(isbn);
	}
}
