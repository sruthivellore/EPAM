import java.io.*;
import java.util.*;
public class solution {
  public static void main(String[] args) throws IOException {
    final StringBuffer sb = new StringBuffer();
    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for(byte T = Byte.parseByte(br.readLine()); T > 0; --T){
      String[] line = br.readLine().split(" ");
      final int N = Integer.parseInt(line[0]);
      final List<Set<Integer>> roads = new ArrayList<Set<Integer>>(N);
      for(int i = 0; i < N; ++i){
        roads.add(new HashSet<Integer>());
      }
      for(short M = Short.parseShort(line[1]); M > 0; --M){
        line = br.readLine().split(" ");
        final int X = Integer.parseInt(line[0]) - 1;
        final int Y = Integer.parseInt(line[1]) - 1;
        roads.get(X).add(Y);
        roads.get(Y).add(X);
      }
      
      final int S = Integer.parseInt(br.readLine()) - 1;
      final int[] minDistances = getEdgelessMinDistances(roads, S, N);
      for(int i = 0; i < S; sb.append(minDistances[i++] + " ")){}
      for(int i = S; ++i < N; sb.append(minDistances[i] + " ")){}
      sb.append("\n");
    }
    System.out.print(sb);
  }
  
  private static int[] getEdgelessMinDistances(final List<Set<Integer>> roads, final int origin, final int N){
    final int[] distances = new int[N];
    for(int i = 0; i < N; distances[i++] = -1){}
    final List<Integer> unvisitedCities = new LinkedList<Integer>();
    for(int i = 0; i < origin; unvisitedCities.add(i++)){}
    for(int i = origin; ++i < N; unvisitedCities.add(i)){}
    final Queue<Integer> q = new LinkedList<Integer>();
    q.add(origin);
    do {
      final int city = q.poll();
      final int distance = ++distances[city];
      final Set<Integer> cityRoads = roads.get(city);
      for(Iterator<Integer> it = unvisitedCities.iterator(); it.hasNext();){
        final int unvisitedCity = it.next();
        if(!cityRoads.contains(unvisitedCity)){
          distances[unvisitedCity] = distance;
          it.remove();
          q.add(unvisitedCity);
        }
      }
    } while (!q.isEmpty());
    
    return distances;
  }
}
