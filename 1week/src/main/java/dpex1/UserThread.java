package dpex1;

public class UserThread extends Thread {
	public UserThread(String name) {
		super(name);
	}
	public void run() {//���� �۵�
		Printer printer = Printer.getPrinter();
		printer.print(Thread.currentThread().getName() + " "+ 
				printer.hashCode());
		//thread�� �������� �����Ҷ��� �ٸ� ��ü�� �����ϴ� ����.(����ð� ������ �߻�)
	}
}
