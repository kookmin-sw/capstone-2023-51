import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Node {
    private String name;
    private int x;
    private int y;
    private BufferedImage image;

    public Node(String name, int x, int y, String imagePath) {
        this.name = name;
        this.x = x;
        this.y = y;

        imagePath = "src/map.png";
        try {
            this.image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            System.out.println("맵 로딩 불가.");
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Edge[] getEdges() {
        return null;
    }

    public void addEdge(Edge edge) {
    }
}
