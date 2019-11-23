package dpex1;

public class Printer {
	 //private static Printer instance; class method�� �����ߵ� private static Printer instance;
	//private static Printer instance = new Printer();�� �ʱ�ȭ ��Ű�� ������ ���� ó�� ����
	private Printer() {};//private�� ��ġ�� new�� ����Ҽ� ����.

	//static = ����  class method�� ����, instance method�� ����
	//������ = ��ü ����  �����ڴ� class method��.
	
	public static class Lazyholder {
		private static Printer instance = new Printer();
	}
	
	public static Printer getPrinter() {
		/*
		 * //��ü ���� X �� ��ü ����, �̹� ���� O�� ��ȯ if(instance == null) {//static���� instance�޼ҵ�
		 * �Ұ� instance = new Printer();//private�� ���ο��� new ���� }//�̺κи� thread�ϳ��� �������� =
		 * �Ӱ豸�� public synchronized ����ȭ //������ �̷��� �ϸ� �ӵ��� ������ (������ �����ϱ� ��õ)
		 */	
		return Lazyholder.instance;
	}
	public void print(String str) {
		System.out.println(str);
	}
	
	public static void foo() {
		System.out.println("Doing something");
	}

}
