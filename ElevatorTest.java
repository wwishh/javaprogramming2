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
			return "���� �����ֽ��ϴ�";
		else {
			openState = true;
			return "���� ���ϴ�";
		}
	}

	public String close() {
		if (openState == false)
			return "���� �����ֽ��ϴ�";
		else {
			openState = false;
			return "���� �ݽ��ϴ�";
		}
	}

	public void pushFloor(int infloor) {

		if (infloor >= MIN && infloor <= MAX) {
			this.infloor = infloor;
			System.out.println(open());
			System.out.println(infloor + "���� �����̽��ϴ�");
			System.out.println(close());
			if (curfloor > infloor)
				goDown(curfloor, infloor);
			else if (curfloor < infloor)
				goUP(curfloor, infloor);
			else
				System.out.println("�������Դϴ�.");

			System.out.println(infloor + "�� �Դϴ�.");

			System.out.println(open());

			curfloor = infloor;
		} else {
			System.out.println(open());
			System.out.println(infloor + "���� �����̽��ϴ�");
			System.out.println("�� ���������ʹ� -3������ 20�������� ����˴ϴ�.");
		}
	}

	private void goUP(int curfloor, int infloor) {
		System.out.println("�ö󰩴ϴ�");
		for (int i = curfloor + 1; i <= infloor; i++) {
			System.out.println(i + "��");
		}
	}

	private void goDown(int curfloor, int infloor) {
		System.out.println("�������ϴ�");
		for (int i = curfloor - 1; i >= infloor; i--) {
			System.out.println(i + "��");
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
