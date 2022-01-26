package pk0313;

class Rectangle {
	private double w, h;
	final double MAX = 1000;

	public Rectangle() {
		this(0, 0);
	}

	public Rectangle(int x, int y) {
		setW(x);
		setH(y);
	}

	public void setW(int x) {
		if (x >= 0 && x <= MAX)
			w = x;
		else {
			w = MAX;
			System.out.println("범위(0~1000.0)값만 입력가능");
		}
	}

	public void setH(int x) {
		if (x >= 0 && x <= MAX)
			h = x;
		else {
			h = MAX;
			System.out.println("범위(0~1000.0)값만 입력가능");
		}
	}

	public double getW() {
		return (this.w);
	}

	public double getH() {
		return (this.h);
	}

	public double cir() {
		return (w + h) * 2;

	}

	public double area() {
		return w * h;

	}

	public void print() {
		System.out.println("폭=" + w + "높이=" + h + "넓이=" + area() + "둘레=" + cir());

	}

	public static double calcArea(double x, double y) {
		double a = x * y;
		return a;
	}

}

class RectangleTest2 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.print();

		Rectangle r2 = new Rectangle(20, 50);
		r2.print();
		System.out.println("r2 : 폭=" + r2.getW() + " 높이=" + r2.getH());

		r2.setW(-4);
		r2.setH(2000);

		double a, w, h;
		w = 20.5;
		h = 50.5;
		a = Rectangle.calcArea(w, h);
		System.out.println("폭=" + w + " 높이=" + h + " 넓이=" + a);

		Rectangle r3 = new Rectangle(30, 50);
		Rectangle arr[] = new Rectangle[3];
		arr[0] = r1;
		arr[1] = r2;
		arr[2] = r3;
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
	}
}
