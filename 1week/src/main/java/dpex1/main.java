package dpex1;

public class main {

	public static void main(String[] args) {
		
		Printer.foo();//�̹� ������ ���ֱ� ������ ��� ���ϴ���� �޸𸮿� �����
		
		
		UserThread user [] = new UserThread[5];
		  
		user[0] = new UserThread("gilsang"); 
		user[1] = new UserThread("gildong");
		user[2] = new UserThread("gilnam"); 
		user[3] = new UserThread("gilsun");
		user[4] = new UserThread("gilmin");
		  
		  
		for(int i = 0; i<5; i++) { 
			user[i].start();//start�� run�� ���� 
			}
		}
		 		
		/*
		 * Printer printer1 = Printer.getPrinter();
		 * printer1.print(printer1.hashCode()+" printer");// printer1 �� �ν��Ͻ� �żҵ� = �ν��Ͻ���
		 * // ����
		 * 
		 * //java���� �⺻ ���� hashcode�� �ٸ��ſ� �����Ҽ� �ִ� �ĺ���
		 * 
		 * Printer printer2 = Printer.getPrinter();
		 * printer2.print(printer2.hashCode()+" printer"); //new �� ���� �׻� �ٸ����� ����
		 * 
		 * //hashcode�� ������ ��ü�� 1��
		 */	

}
