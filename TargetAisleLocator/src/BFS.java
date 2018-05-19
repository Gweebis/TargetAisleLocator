import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS { 
 
    private Queue<String> queue;
 
    public BFS() {
        queue = new LinkedList<String>();
    }
 
    public void bfs(String adj_matrix[][], String start, ArrayList<Product> items) {
        int number_of_nodes = adjacency_matrix[start].length - 1;
 
        String[] visited = new int[number_of_nodes + 1]; // keep track of visited nodes
        String vertex;
        int i, j;
 
        visited[start] = 1; // 1 is visited, 0 is not visited
        queue.add(start);
 
        while (!queue.isEmpty()) {
            vertex = queue.remove();
            i = Interger.parseInt(vertex);
            j = i;
            System.out.print(vertex);
            while (j <= number_of_nodes) {
                String curr = String.valueOf(j);
                if (visited[curr] == 0) {
                    queue.add(curr);
                    visited[curr] = 1;
                }
                j++;
            }
        }
    }
}