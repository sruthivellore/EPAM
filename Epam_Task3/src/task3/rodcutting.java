package task3;
import java.util.*;
public class rodcutting
{
	public static void main(String []args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int testcases;
		testcases=sc.nextInt();
		while((testcases--)!=0)
		{
			int number;
			int count=0;
			number=sc.nextInt();
			if(number<0)
				System.out.println("0");
			else
			{
				number++;
				while(number>0)
				{
					number=number/2;
					count=count+1;
				}
			}
			System.out.println(count-2);
			
        }
		
	}

}
