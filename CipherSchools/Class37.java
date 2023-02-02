import java.util.Map;
import java.util.HashMap;
public class Class37 {
    static class Solution {
        public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
            Map<Integer, Integer> graph = new HashMap<>();
            for (int[] reserved : reservedSeats) {
                int row = reserved[0];
                int col = reserved[1];
                graph.put(row, graph.getOrDefault(row, 0) | (1 << col)); 
            }
            int max = 0;
            for (int row : graph.keySet()) {
                int reserved = graph.get(row);
                int cnt = 0;
                if ((reserved &  60) == 0) cnt += 1; 
                if ((reserved & 960) == 0) cnt += 1; 
                if ((reserved & 240) == 0 && cnt == 0) cnt = 1; 
                max += cnt;
            }
            return max + 2 * (n - graph.size());
        }
    }
}
