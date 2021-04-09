package java8_nyuumon;

public class AdminUser extends User {
	public AdminUser(String name) {
		super(name);
	}
	
	public void sayHello() {
		System.out.println("Hello! " + this.name);
	}
	
	@Override
	public void sayHi() {
		System.out.println("[admin]Hi! " + this.name);
	}
}
