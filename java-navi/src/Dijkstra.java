import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Collections;

public class Dijkstra {
    public static void computePaths(Node source, Graph graph) {
        Map<Node, Integer> distance = new HashMap<>();
        Map<Node, Node> previous = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(distance::get));

        // Initialize distance and previous
        for (Node node : graph.getNodes()) {
            if (node.equals(source)) {
                distance.put(node, 0);
            } else {
                distance.put(node, Integer.MAX_VALUE);
            }
            previous.put(node, null);
            pq.offer(node);
        }

        while (!pq.isEmpty()) {
            Node u = pq.poll();

            if (distance.get(u) == Integer.MAX_VALUE) {
                break;
            }

            for (Edge e : graph.getAdjacentEdges(u)) {
                Node v = e.getDestination();
                int alt = distance.get(u) + e.getWeight();

                if (alt < distance.get(v)) {
                    distance.put(v, alt);
                    previous.put(v, u);

                    // Update the priority queue
                    pq.remove(v);
                    pq.offer(v);
                }
            }
        }
    }

    public static List<Node> getShortestPathTo(Node destination, Map<Node, Node> previous) {
        List<Node> path = new ArrayList<>();
        Node current = destination;

        while (current != null) {
            path.add(current);
            current = previous.get(current);
        }
        Collections.reverse(path);
        return path;
    }

    public static Map<Node, Node> getPreviousMap() {
        return null;
    }
}