package study;

public class Study_0126_04_실습 {

	public static void main(String[] args) {
		/*String str="";
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				str += "*";
				System.out.println(str);
			}
		}*/
		/*for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		for(int i=0; i<5; i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
