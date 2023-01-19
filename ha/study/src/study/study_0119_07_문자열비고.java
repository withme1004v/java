package study;

public class study_0119_07_문자열비고 {

	public static void main(String[] args) {
		String hak = "A학점";
		if(hak=="A학점") {
			System.out.println("90~100점입니다.");
		}
		else if(hak.equals("B학점")) {
			System.out.println("80~90점입니다.");
		}
		else if(hak.equals("C학점")) {
			System.out.println("70~80점입니다.");
		}
		else {
			System.out.println("70점입니다.");
		}
	}

}
