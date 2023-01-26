package study;

public class Study_0126_06_while_구구단 {

	public static void main(String[] args) {
		int i=2, j=1;
		while(i<10) 
		{
			while(j<10) 
			{
			  System.out.println(i+"X"+j+"="+i*j);
			  j++;
			  
			}
			j=1;
			i++;
		}

	}

}
