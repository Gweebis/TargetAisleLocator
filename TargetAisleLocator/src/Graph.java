import java.io.*;
import java.util.*;

public class Graph {
	private String Vertices; 
    private LinkedList<LinkedList<String>> map; //Adjacency Lists to keep track of vertices

    // Constructor
    Graph(String v) {
        Vertices = v;
        map = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
}
