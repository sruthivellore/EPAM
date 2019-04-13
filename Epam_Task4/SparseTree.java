import java.util.Scanner;
public class SparseTree
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in); 
	      int n=sc.nextInt();
	      String []s=new String[n];   
	      int count=0;
	     for(int i=0;i<n;i++)
	        {
	          sc.nextLine();
	           s[i]=sc.next();
	        }   
	    int n1=sc.nextInt();
	    String[] s1=new String[n1];
	    for(int j=0;j<n1;j++)
	        {
	           sc.nextLine();
	           s1[j]=sc.next();  
	      }
	   for(int i=0;i<n1;i++)
	       {
	          count=0;
	          for(int j=0;j<n;j++)
	              {
	                 if((s[j].equals(s1[i])))
	                     {
	                     count++;
	                    }

	              }
	         System.out.println(count);
	 
	     }     }
	}
