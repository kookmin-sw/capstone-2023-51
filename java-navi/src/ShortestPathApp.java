import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortestPathApp extends JFrame {
    private static final long serialVersionUID = 1L;

    private Graph graph;
    private Map<String, Node> nodeMap;

    public ShortestPathApp() {
        super("Shortest Path App");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        nodeMap = new HashMap<>();
        initGraph();

        String source = JOptionPane.showInputDialog(this, "출발점을 입력하시오:");
        String destination = JOptionPane.showInputDialog(this, "도착지를 입력하시오:");

        Node sourceNode = nodeMap.get(source);
        Node destNode = nodeMap.get(destination);

        if (sourceNode != null && destNode != null) {
            Dijkstra.computePaths(sourceNode, graph);
            List<Node> path = Dijkstra.getShortestPathTo(destNode, Dijkstra.getPreviousMap());

            if (path.isEmpty()) {
                JOptionPane.showMessageDialog(this, "경로가 존재하지 않습니다");
            } else {
                drawGraph(path);
            }
        } else {
            JOptionPane.showMessageDialog(this, "입력이 잘못되었습니다..");
        }
    }

    private void initGraph() {
        // 노드 생성
        Node n0 = new Node("A", 100, 50, "map.png");
        Node n1 = new Node("B", 100, 100, "map.png");

        // 엣지 생성
        addEdge(n0, n1, 3);
        addEdge(n1, n0, 3);

        // 그래프 생성
        graph = new Graph(new ArrayList<>(Arrays.asList(n0, n1)));
    }

    private void addEdge(Node source, Node dest, int weight) {
        Edge edge = new Edge(source, dest, weight);
        source.addEdge(edge);
        dest.addEdge(edge);
    }

    private void drawGraph(List<Node> path) {
        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1L;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2 = (Graphics2D) g;

                // Draw nodes
                for (Node node : graph.getNodes()) {
                    if (path.contains(node)) {
                        g2.setColor(Color.GREEN);
                    } else {
                        g2.setColor(Color.RED);
                    }
                    g2.fillOval(node.getX() - 10, node.getY() - 10, 20, 20);
                    g2.setColor(Color.BLACK);
                    g2.drawString(node.getName(), node.getX() - 5, node.getY() - 15);

                    // Draw edges
                    for (Edge edge : node.getEdges()) {
                        g2.setColor(Color.BLACK);
                        g2.setStroke(new BasicStroke(2));
                        g2.drawLine(edge.getSource().getX(), edge.getSource().getY(), edge.getDestination().getX(),
                                edge.getDestination().getY());

                        // Draw edge weights
                        g2.setColor(Color.BLUE);
                        g2.drawString(Integer.toString(edge.getWeight()),
                                (edge.getSource().getX() + edge.getDestination().getX()) / 2,
                                (edge.getSource().getY() + edge.getDestination().getY()) / 2);
                    }
                }
            }
        };

        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ShortestPathApp();
    }

    public void run() {
    }
}
