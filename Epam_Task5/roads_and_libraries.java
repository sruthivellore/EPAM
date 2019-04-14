import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class solution {

    public static long solving(int n, long clib, long croad, ArrayList<TreeSet<Integer>> adj) {
        if (clib <= croad) { return (clib * n); }
        long cost = 0;
        boolean[] visitednodes = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visitednodes[i]) {
                long TmpCost = clib;
                Stack<Integer> st = new Stack<>();
                st.push(i);
                visitednodes[i] = true;
                while (!st.empty()) {
                    int u = st.pop();
                    Iterator<Integer> it = adj.get(u).iterator();
                    while (it.hasNext()) {
                        int v = it.next();
                        if (!visitednodes[v]) {
                            st.push(v);
                            visitednodes[v] = true;
                           TmpCost += croad;
                        }
                    }
                }
                cost += TmpCost;
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            long clib = sc.nextLong();
            long croad = sc.nextLong();
            ArrayList<TreeSet<Integer>> ar = new ArrayList<>();
            for (int j = 0; j < n; j++) { ar.add(new TreeSet<Integer>()); }
            for(int k = 0; k < m; k++){
                int u = sc.nextInt();
                u--;
                int v = sc.nextInt();
                v--;
                ar.get(u).add(v);
                ar.get(v).add(u);
            }
            System.out.println(solution.solving(n, clib, croad, ar));
            sc.close();
        }
    }
}
