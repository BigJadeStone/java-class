package quiz14;

public class Tank extends Unit {
	
	private boolean mode;
	
	public Tank() {
		super(100);
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
	
	//특별한기능 - mode변경
	public void changeMode() {
		if(mode) {
			mode = false;
		} else {
			mode = true;
		}
	}
	
}
