import javax.swing.*;
import java.awt.*;

public class ImageLoader extends JFrame {

    ImageLoader() {
        this.add(new ImagePanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 797);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageLoader();
    }
}

class ImagePanel extends JPanel {
    private Image dot;

    public ImagePanel() {
        loadImage();
        setPreferredSize(new Dimension(1280, 797));
    }

    private void loadImage() {
        try {
            System.out.println("Loading Image...");
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("resources\\tree.png"));
            dot = i1.getImage();
            if (dot == null) {
                throw new RuntimeException("Image not found");
            }
            repaint(); // Repaint the panel after loading the image
        } catch (Exception e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (dot != null) {
            System.out.println("Drawing Image"); // Debugging print
            g.drawImage(dot, 0, 0, this);
        }
    }
}
