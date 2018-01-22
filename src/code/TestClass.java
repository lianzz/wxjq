package code;

public class TestClass {
	public static void main(String[] args) {
		Long l1 = 1999923L;
		Long l2 = 3828984293L;
		if (l1.compareTo(l2) != 0) {
			System.out.println("no equals");
		}else{
			System.out.println("l1 equals l2");
		}
	}
}
