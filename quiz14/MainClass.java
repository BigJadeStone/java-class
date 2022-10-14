package quiz14;

public class MainClass {

	public static void main(String[] args) {
		
		Marine m = new Marine(); 
		m.move(10, 20);
		m.location();
		m.stop();
		System.out.println( Marine.armor );
		System.out.println( Marine.attack );
		
		
		
		
	}
}
