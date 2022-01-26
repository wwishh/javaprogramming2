package pk0322;


class Member { // �Ϲݻ�� Ŭ���� ����
	protected String name; // ����
	protected int family; // ������
	protected long base; // �⺻��
	protected long pay; // �޿�

	public Member(String inname, int infam, long inbase) { // ������
		name = inname;
		family = infam;
		base = inbase;
		this.paycalc(); // �޿� ��� �޼��� ȣ��
	}

	public void paycalc() { // �޿���� �޼���
		pay = base + family * 30000;
	}

	public void print() { // ���
		System.out.println("����� ������  �⺻��  �޿� ");
		System.out.println("-------------------------------");
		System.out.println(name + "   " + family + "    " + base + "  " + pay);
	}
}

class Manager extends Member { // �Ŵ��� Ŭ���� , ��� Ŭ�������� ���
	protected String order; // ����
	protected long allowance; // ����

	public Manager(String inname, int infam, long inbase, String order) { // ������
		super(inname, infam, inbase); // ����Ŭ������ ������ ȣ��
		this.order = order;
		if (order.equals("�븮"))
			allowance = 300000;
		else if (order.equals("����"))
			allowance = 500000;
		else if (order.equals("����"))
			allowance = 900000;
		else
			allowance = 1000000;
		this.paycalc(); // MemberŬ������ paycalc() ȣ��

	}

	public void paycalc() { // �޿���� , MemberŬ������ paycalc() overriding
		super.paycalc();
		pay += allowance;
	}

	public void print() { // ���, , MemberŬ������ print() overriding
		System.out.println("����� ������ ����  �⺻��  ���޼��� �޿�  ");
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
		System.out.println("����� ������ ���� �⺻�� ���޼��� Ȱ���� �޿�");
		System.out.println("-------------------------");
		System.out.println(name + "" + family + "" + order + "" + base + " " + allowance + " " + bounty + " " + pay);
	}
}

	

class PayEx3 {
	public static void main(String[] args) {
		Member[] m = { new Member("ȫ�浿", 3, 1000000), new Member("������", 2, 1800000),
				new Manager("�̽¾�", 4, 2000000, "����"), new Director("������", 2, 2500000, "����") };

		for (int i = 0; i < m.length; i++) {
			m[i].print(); // late binding
			System.out.println();
		}
	}
}

