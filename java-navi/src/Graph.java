import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private final List<Node> nodes = new ArrayList<>();
    private final List<Edge> edges = new ArrayList<>();
    private final Map<Node, List<Edge>> adjacentEdges = new HashMap<>();

    public Graph(ArrayList arrayList) {
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(Edge edge) {
        Node source = edge.getSource();
        Node destination = edge.getDestination();
        edges.add(edge);

        if (!adjacentEdges.containsKey(source)) {
            adjacentEdges.put(source, new ArrayList<>());
        }
        adjacentEdges.get(source).add(edge);

        if (!adjacentEdges.containsKey(destination)) {
            adjacentEdges.put(destination, new ArrayList<>());
        }
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public List<Edge> getAdjacentEdges(Node node) {
        return adjacentEdges.get(node);
    }

}
