package study;

public class study0119_02_증감연산 {

	public static void main(String[] args) {
		//증가연산자--전위연산자,후위연산자
		//감소연산자-전위연산자, 후위연산자
		//복합대입연산자
		int i = 1;
		int j = 1;
		int k=++i;
		//전위연산자
		System.out.println(++i);
		System.out.println(j++);
		System.out.println(k);
		int x=1;
		x+=1;//x++; x=x+1;
		System.out.println("x : "+x);
		int y=x++;
		System.out.println("y : "+y);
		System.out.println("x : "+x);
		
		//복합대입연산자
		int num = 0;
		num = num + 2;//num += 2;
		System.out.println("num1 : "+num);
		num *= 2;
		System.out.println("num2 : "+num);
		num /= 2;
		System.out.println("num3 : "+num);
		num %= 2;
		System.out.println("num4 : "+num);

	}

}
