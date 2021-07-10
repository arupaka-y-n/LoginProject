package oracleJavaStudy;

class A  {
	String val = "A";
	void print() {
		System.out.print(val);
	}
}

class B extends A {
	String val  ="B";
	
	void print() {
		System.out.print(val);
	}
}