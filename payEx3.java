package pk0322;


class Member { // 일반사원 클래스 정의
	protected String name; // 성명
	protected int family; // 가족수
	protected long base; // 기본급
	protected long pay; // 급여

	public Member(String inname, int infam, long inbase) { // 생성자
		name = inname;
		family = infam;
		base = inbase;
		this.paycalc(); // 급여 계산 메서드 호출
	}

	public void paycalc() { // 급여계산 메서드
		pay = base + family * 30000;
	}

	public void print() { // 출력
		System.out.println("사원명 가족수  기본급  급여 ");
		System.out.println("-------------------------------");
		System.out.println(name + "   " + family + "    " + base + "  " + pay);
	}
}

class Manager extends Member { // 매니저 클래스 , 사원 클래스에서 상속
	protected String order; // 직위
	protected long allowance; // 수당

	public Manager(String inname, int infam, long inbase, String order) { // 생성자
		super(inname, infam, inbase); // 상위클래스의 생성자 호출
		this.order = order;
		if (order.equals("대리"))
			allowance = 300000;
		else if (order.equals("과장"))
			allowance = 500000;
		else if (order.equals("부장"))
			allowance = 900000;
		else
			allowance = 1000000;
		this.paycalc(); // Member클래스의 paycalc() 호출

	}

	public void paycalc() { // 급여계산 , Member클래스의 paycalc() overriding
		super.paycalc();
		pay += allowance;
	}

	public void print() { // 출력, , Member클래스의 print() overriding
		System.out.println("사원명 가족수 직위  기본급  직급수당 급여  ");
		System.out.println("--------------------------------------------");
		System.out.println(name + "   " + family + "    " + order + "  " + base + "  " + allowance + "  " + pay);
	}
}

class Director extends Manager {
	protected long bounty;

	public Director(String inname, int infam, long inbase, String order) {
		super(inname, infam, inbase, order);
		this.bounty = 1000000;
	}

	public void paycalc() {
		super.paycalc();
		pay += bounty;
	}

	public void print() {
		System.out.println("사원명 가족수 직위 기본급 직급수당 활동비 급여");
		System.out.println("-------------------------");
		System.out.println(name + "" + family + "" + order + "" + base + " " + allowance + " " + bounty + " " + pay);
	}
}

	

class PayEx3 {
	public static void main(String[] args) {
		Member[] m = { new Member("홍길동", 3, 1000000), new Member("성춘향", 2, 1800000),
				new Manager("이승언", 4, 2000000, "과장"), new Director("김정웅", 2, 2500000, "사장") };

		for (int i = 0; i < m.length; i++) {
			m[i].print(); // late binding
			System.out.println();
		}
	}
}

