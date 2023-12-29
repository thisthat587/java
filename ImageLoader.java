import javax.swing.*;
import java.awt.*;

class ImagePanel extends JPanel {
    private Image tree;

    public ImagePanel() {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("resources\\tree.png"));
        tree=i1.getImage();
        setPreferredSize(new Dimension(1280,797));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(tree,0,0,this);
    }
}

class ImageLoader extends JFrame {

    public ImageLoader() {
        this.add(new ImagePanel());
        setSize(1280,797);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new ImageLoader();
    }
}