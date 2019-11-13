package ssss;

public class WordCorrect {

	public static void main(String[] args) {

		String inputString = "aadddd";
		if (isUniqueChars(inputString)) {
			System.out.println("같은 문자가 없습니다.");
		} else {
			System.out.println("같은 문자가 존재합니다.");
		}
	}

	static boolean isUniqueChars(String str) {
		// 코드 작성
		// 매개변수값을 배열로 받고 저장
		// 반복문으로 배열의 길이만큼 반복해서 값을 비교함
		for (int i = 0; i < str.length(); i++) {
			if (i >= str.length() - 1) {
				break;
			}
			// System.out.println("i "+i);
			for (int j = i; j < str.length(); j++) {

				if (j >= str.length() - 1) {
					break;
				}
				String I = str.substring(i, i+1);
				String J = str.substring(j+1, j+2);
				System.out.println("j "+J);
				if (str.substring(i, i+1).equals(J)) {
					System.out.println("i "+I);
				}
				break;
			}
		}
		return true;
	}
}