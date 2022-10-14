package quiz14;

public class DropShip extends Unit {

	public DropShip() {
		super(150);
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
