package quiz14;

public class Marine extends Unit {
	
	public static int attack = 6;
	public static int armor = 0;
	
	public Marine() {
		super(40); 
	}

	@Override
	public void location() {
		System.out.println("현재위치:" + this.x + "," + this.y);
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void stop() {
		System.out.println("stop");
	}
}
