import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleMouseCheck extends JFrame {

    private Rectangle rectangle;
    private String message = "Move the mouse inside the window";

    public RectangleMouseCheck() {
        setTitle("Rectangle Mouse Check");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rectangle = new Rectangle(100, 70, 200, 100);

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Point mousePoint = e.getPoint();
                if (rectangle.contains(mousePoint)) {
                    message = "Mouse is inside the rectangle";
                } else if (getBounds().contains(mousePoint)) {
                    message = "Mouse is outside the rectangle but inside the window";
                }
                repaint();
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                message = "Mouse is outside the window";
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLUE);
        g2d.fill(rectangle);

        g2d.setColor(Color.BLACK);
        g2d.drawString(message, 20, 50);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RectangleMouseCheck frame = new RectangleMouseCheck();
            frame.setVisible(true);
        });
    }
}
