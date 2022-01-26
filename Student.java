package pk0315;

class Student1 {
	private int no;
	private double report, midScore, finalScore;
	static final int MAX = 100;
	static int stNO = 101;

	public Student1() {
		this(0, 0, 0);
	}

	public Student1(double x, double y, double z) {
		no = stNO;
		stNO++;
		if (0 <= x && x <= MAX)
			report = x;
		else {
			report = 0;
			System.out.println("범위오류");
		}
		if (0 <= y && y <= MAX)
			midScore = y;
		else {
			midScore = 0;
			System.out.println("범위오류");
		}
		if (0 <= z && z <= MAX)
			finalScore = z;
		else {
			finalScore = 0;
			System.out.println("범위오류");
		}
	}

	public double getAVG() {
		return ((report + midScore + finalScore) / 3.0);
	}

	public char getGrade() {
		char Grade;
		if (getAVG() >= 90) {
			Grade = 'A';
		} else if (getAVG() >= 80 && getAVG() < 90) {
			Grade = 'B';
		} else if (getAVG() >= 70 && getAVG() < 80) {
			Grade = 'C';
		} else if (getAVG() >= 60 && getAVG() < 70) {
			Grade = 'D';
		} else
			Grade = 'F';
		return Grade;
	}

	public String toString() {
		return "학번:" + no + "레포트점수:" + report + "중간점수:" + midScore + "기말점수:" + finalScore + "학점:" + getGrade();
	}

	public static Student1 createStudent(int x, int y, int z) {
		return new Student1(x, y, z);
	}
}

class Student {
	public static void main(String arags[]) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1(50, 70, 90);
		System.out.println(s1);
		System.out.println(s2);
		Student1 s3 = new Student1(103, 34, 45);
		System.out.println(s3);

		Student1 slist[] = { new Student1(34, 56, 78), new Student1(67, 34, 56), new Student1(57, 78, 65) };
		for (Student1 s : slist)
			System.out.println(s);
	}
}
