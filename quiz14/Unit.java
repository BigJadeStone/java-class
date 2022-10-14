package quiz14;

public abstract class Unit { //부모클래스
	
	public int x;
	public int y;
	public int hp;
	//생성자
	public Unit(int hp) {
		this.hp = hp;
	}
	
	public abstract void location();
	public abstract void move(int x, int y);
	public abstract void stop();
	
	
}
