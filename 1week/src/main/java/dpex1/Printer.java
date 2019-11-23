package dpex1;

public class Printer {
	 //private static Printer instance; class method로 만들어야됨 private static Printer instance;
	//private static Printer instance = new Printer();이 초기화 시키는 문장은 가장 처음 실행
	private Printer() {};//private로 고치면 new를 사용할수 없다.

	//static = 정적  class method는 정적, instance method는 동적
	//생성자 = 객체 생성  생성자는 class method다.
	
	public static class Lazyholder {
		private static Printer instance = new Printer();
	}
	
	public static Printer getPrinter() {
		/*
		 * //객체 생성 X 면 객체 생성, 이미 생성 O면 반환 if(instance == null) {//static에서 instance메소드
		 * 불가 instance = new Printer();//private은 내부에서 new 가능 }//이부분만 thread하나씩 들어오게함 =
		 * 임계구역 public synchronized 동기화 //하지만 이렇게 하면 속도가 낮아짐 (가능한 사용안하길 추천)
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
