import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemEventDemo extends JFrame {

    private String selectedChoice = "Select an option";

    public ItemEventDemo() {
        setTitle("Item Event and Child Frame Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                selectedChoice = "Selected: " + choice.getSelectedItem();
                repaint();
            }
        });

        add(new JLabel("Choose an option:"));
        add(choice);

        Button openChildButton = new Button("Open Child Frame");
        openChildButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame childFrame = new JFrame("Child Frame");
                childFrame.setSize(300, 200);
                childFrame.setLayout(new FlowLayout());
                childFrame.add(new JLabel("This is a child frame"));
                childFrame.setVisible(true);
                childFrame.setLocationRelativeTo(null);
            }
        });

        add(openChildButton);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(selectedChoice, 20, 100);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ItemEventDemo frame = new ItemEventDemo();
            frame.setVisible(true);
        });
    }
}
