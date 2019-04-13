package task3;
import java.util.*;
public class bulbs
{
	 static Set<Integer> list = new TreeSet<>(  );
	    static List<Integer> switches = new ArrayList<>( 12 );
	    public static void main( String[] args )
	    {
	        @SuppressWarnings("resource")
			Scanner s = new Scanner( System.in );
	 
	        List<Integer> result = new ArrayList<>();
	        long k, l, h, m = 0;
	        int i;
	        long ans = 0;
	 
	        while ( s.hasNextLine() ) {
	            list.clear();
	            switches.clear();
	            result.clear();
	            s.nextLine();
	            String switchString = s.nextLine();
	            k = s.nextLong();
	 
	            for(i =0 ; i< switchString.length(); i++){
	                if(switchString.charAt( i )-48 == 1) switches.add( i+1 );
	            }
	 
	            l=1; h= 1000000000000000L;
	 
	            while ( l <= h ){
	                m = (l+h) >> 1;
	                if(calc(m) >= k){
	                    ans = m;
	                    h = m-1;
	 
	                }
	                else  l = m+1;
	            }
	 
	            System.out.println(ans);
	 
	        }
	    }
	 
	 
	    private static long calc( long m )
	    {
	        int p = switches.size();
	        int i,j;
	        long res = 0;
	        for(i=1; i< (1 << p); i++ ){
	            long pr = 1;
	            int sign = -1 ;
	            for(j =0; j < p; j++ ){
	                if(((i>>j)&1) == 1){
	                    pr = pr * switches.get( j );
	                    sign *= -1;
	                }
	            }
	            res += sign*(m/pr);
	        }
	        return res;
	    }
	}