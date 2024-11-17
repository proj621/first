import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame {

    private String message = "Interact with the window using the mouse";

    public MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                message = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                message = "Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")";
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                message = "Mouse Released at (" + e.getX() + ", " + e.getY() + ")";
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                message = "Mouse Entered the window";
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                message = "Mouse Exited the window";
                repaint();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                message = "Mouse Moved to (" + e.getX() + ", " + e.getY() + ")";
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                message = "Mouse Dragged to (" + e.getX() + ", " + e.getY() + ")";
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(message, 20, 50);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseEventDemo frame = new MouseEventDemo();
            frame.setVisible(true);
        });
    }
}
