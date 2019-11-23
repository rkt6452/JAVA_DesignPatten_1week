package dpex1;

public class main {

	public static void main(String[] args) {
		
		Printer.foo();//이미 참조가 돼있기 때문에 사용 안하더라고 메모리에 저장됨
		
		
		UserThread user [] = new UserThread[5];
		  
		user[0] = new UserThread("gilsang"); 
		user[1] = new UserThread("gildong");
		user[2] = new UserThread("gilnam"); 
		user[3] = new UserThread("gilsun");
		user[4] = new UserThread("gilmin");
		  
		  
		for(int i = 0; i<5; i++) { 
			user[i].start();//start로 run을 실행 
			}
		}
		 		
		/*
		 * Printer printer1 = Printer.getPrinter();
		 * printer1.print(printer1.hashCode()+" printer");// printer1 는 인스턴스 매소드 = 인스턴스가
		 * // 실행
		 * 
		 * //java에서 기본 제공 hashcode는 다른거와 구분할수 있는 식별자
		 * 
		 * Printer printer2 = Printer.getPrinter();
		 * printer2.print(printer2.hashCode()+" printer"); //new 를 쓰면 항상 다른값이 나옴
		 * 
		 * //hashcode가 같으면 객체는 1개
		 */	

}
