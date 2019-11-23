package dpex1;

public class UserThread extends Thread {
	public UserThread(String name) {
		super(name);
	}
	public void run() {//동시 작동
		Printer printer = Printer.getPrinter();
		printer.print(Thread.currentThread().getName() + " "+ 
				printer.hashCode());
		//thread가 여러개를 실행할때는 다른 객체를 생성하는 오류.(실행시간 떄문에 발생)
	}
}
