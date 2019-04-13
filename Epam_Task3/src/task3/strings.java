package task3;
import java.util.*;
public class strings
 {
    
    static int arr[]=new int[25];
	static int find(int x)
	{
		if(arr[x]==x)
		{
			return x;
		}
		else
		{
			arr[x]=find(arr[x]);
			return arr[x];
		}
	}
    public static void main(String args[] ) throws Exception {
      
        Scanner sc=new Scanner(System.in);
        long m=1;
		int n = sc.nextInt();
		int ans=0;
		int a = sc.nextInt();
		int power = sc.nextInt();	
		sc.close();
		for(int i=1;i<n;i++)
		{
			for (long j=1,s; j<(1<<(n-i)); j++)
            { 
                s=-1;
                int b=0;
                while(b < n)
			    {
			        arr[b]=b;
			        b++;
			    }
			    for (int k=1; k<=n-i; k++)
                { 
            	    if((j&(1<<(k-1)))>0)
            	    {
            		    s=-s;
            		    for (int l=0; l<i; l++)
            		    { 
            			    if (find(l)!=find(k+l))
                            {
            				    arr[find(k+l)]=find(l);
            				}
            		    }
            	    }
                }
			    if (s<0) 
			    { 
			        s+=power;
			    }
                for (int k=0; k<n; k++)
                {
                    if (find(k)==k) 
                    { 
                        s=m*(s*a)%power;
                    }
                }
                ans=(int) ((ans+s)%power);
            }
		}
		System.out.println(ans);
    }
 } 
