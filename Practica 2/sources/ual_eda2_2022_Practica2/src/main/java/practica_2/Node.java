package practica_2;

import java.util.ArrayList;
import java.util.List;
 
public class Node {
	
    private String city;
    private List<Edge> edges;
 
    public Node(String city) {
        this.city = city;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public List<Edge> getEdges() {
        return edges;
    }
 
    public void addEdge(Edge edge) {
        if (edges == null) {
            edges = new ArrayList<Edge>();
        }
        edges.add(edge);
    }
 
    @Override
    public String toString() {
        return "\n \tNode [city=" + city + ", edges=" + edges + "]";
    }
}
