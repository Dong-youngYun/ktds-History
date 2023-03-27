package access;

public class Main {

	public static void main(String[] args) {
		Public pub = new Public();
		pub.add();
		
		int publicNumberOne = pub.getNumberOne();
		System.out.println(publicNumberOne);
		
		pub.setNumberOne(7);
		
		publicNumberOne = pub.getNumberOne();
		System.out.println(publicNumberOne);
		
		int publicNumberTwo = pub.getNumberTwo();
		System.out.println(publicNumberTwo);
		
		pub.setNumberTwo(4);
		
		publicNumberTwo = pub.getNumberTwo();
		System.out.println(publicNumberTwo);
		pub.add();
		
		
		
		
		
		
	}
	
}
