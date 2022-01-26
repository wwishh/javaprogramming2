package pk0311;

class MyClass {
	private int x, y;
	private String z;
	final int MAX = 100;
	static int count = 0;
	String name;

	public MyClass() {
		this(10, 10);
	}

	public MyClass(int x, int y) {
		count++;
		setXY(x, y);
	}

	public MyClass(int x, int y, String z) {
		setXY(x,y);
		setname(z);
	}

	public void setXY(int x, int y) {
		if (x <= MAX)
			this.x = x;
		else
			this.x = MAX;
		if (y <= MAX)
			this.y = y;
		else
			this.y = MAX;
	}

	public int getX() {
		return (this.x);
	}

	public int getY() {
		return (this.y);
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return (this.name);
	}

	public void print() {
		System.out.println("x=" + x + ", y=" + y + ", z=" + z);
	}
}

class ClassTest {
	public static void main(String[] args) {
		String name="ȫ�浿";
		System.out.println(name.toString());
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass(50, 250);
		MyClass c3 = new MyClass();
		System.out.println("c1=" + c1.getX() + "," + c1.getY());
		c1.print();
		c1.setXY(10, 50);
		c1.print();
		c2.print();
		c3.setname("ȫ�浿");
		c3.print();
		System.out.println("count = " + MyClass.count);
	}
}