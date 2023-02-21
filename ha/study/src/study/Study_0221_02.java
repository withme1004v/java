package study;

	import java.io.*;
	public class Study_0221_02 implements Serializable {
		private String name;
		private int kor;
		private int eng;
		private int math;
		private static transient BufferedReader in;
		static {
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public Study_0221_02() throws IOException {		
			System.out.print("name :");
			name = in.readLine();
			System.out.print("kor : ");
			kor = Integer.parseInt(in.readLine());
			System.out.print("eng : ");
			eng = Integer.parseInt(in.readLine());
			System.out.print("math : ");
			math = Integer.parseInt(in.readLine());
		}
		public void disp() {
			System.out.print(name + " / ");
			System.out.print("총점 : "+(kor+eng+math) + " / ");
			System.out.print("평균 : "+(kor+eng+math)/3);
			System.out.println();
		}
	}