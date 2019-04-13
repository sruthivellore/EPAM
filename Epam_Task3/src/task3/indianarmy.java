package task3;
import java.util.*;
public class indianarmy 
{
	@SuppressWarnings("resource")
	public static void main(String args[] ) throws Exception
	{
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        long min[]=new long[n+2];
	        long max[]=new long[n+2];
	        min[0]=sc.nextLong();
	        min[1]=sc.nextLong();
	        max[0]=min[0];
	        max[1]=min[1];
	        for(int i=2;i<n+2;i++)
	        {
	            long pos=sc.nextLong();
	            long army=sc.nextLong();
	            if((min[0]<=pos+army)&&(max[1]>=pos-army)){
	                min[i]=pos-army;
	                max[i]=pos+army;
	            }
	            else if(min[0]<pos+army){
	                min[i]=min[1];
	                max[i]=min[1];
	            }
	            else
	            {
	                min[i]=min[0];
	                max[i]=min[0];
	            }
	        }
	        Arrays.sort(min);
	        Arrays.sort(max);
	        long sum=0;
	        for(int j=1;j<min.length;j++)
	        {
	            if(min[j]-max[j-1]>0)
	                sum+=min[j]-max[j-1];
	            
	        }
	          System.out.print(sum);
	    }
	}
