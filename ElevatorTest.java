package pk0319;

class Elevator {
	int curfloor;
	boolean openState;
	int infloor;
	final int MAX = 20;
	final int MIN = -3;

	public Elevator() {
		this.curfloor = 1;
		this.openState = false;
	}

	public String open() {
		if (openState == true)
			return "¹®ÀÌ ¿­·ÁÀÖ½À´Ï´Ù";
		else {
			openState = true;
			return "¹®À» ¿±´Ï´Ù";
		}
	}

	public String close() {
		if (openState == false)
			return "¹®ÀÌ ´ÝÇôÀÖ½À´Ï´Ù";
		else {
			openState = false;
			return "¹®À» ´Ý½À´Ï´Ù";
		}
	}

	public void pushFloor(int infloor) {

		if (infloor >= MIN && infloor <= MAX) {
			this.infloor = infloor;
			System.out.println(open());
			System.out.println(infloor + "ÃþÀ» ´©¸£¼Ì½À´Ï´Ù");
			System.out.println(close());
			if (curfloor > infloor)
				goDown(curfloor, infloor);
			else if (curfloor < infloor)
				goUP(curfloor, infloor);
			else
				System.out.println("°°ÀºÃþÀÔ´Ï´Ù.");

			System.out.println(infloor + "Ãþ ÀÔ´Ï´Ù.");

			System.out.println(open());

			curfloor = infloor;
		} else {
			System.out.println(open());
			System.out.println(infloor + "ÃþÀ» ´©¸£¼Ì½À´Ï´Ù");
			System.out.println("ÀÌ ¿¤¸®º£ÀÌÅÍ´Â -3ÃþºÎÅÍ 20Ãþ±îÁö¸¸ ¿îÇàµË´Ï´Ù.");
		}
	}

	private void goUP(int curfloor, int infloor) {
		System.out.println("¿Ã¶ó°©´Ï´Ù");
		for (int i = curfloor + 1; i <= infloor; i++) {
			System.out.println(i + "Ãþ");
		}
	}

	private void goDown(int curfloor, int infloor) {
		System.out.println("³»·Á°©´Ï´Ù");
		for (int i = curfloor - 1; i >= infloor; i--) {
			System.out.println(i + "Ãþ");
		}
	}

}

public class ElevatorTest {

	public static void main(String[] args) {
		Elevator elv1 = new Elevator();

		elv1.open();
		elv1.pushFloor(10);
		elv1.open();
		elv1.pushFloor(30);
		elv1.pushFloor(-2);
	}

}
