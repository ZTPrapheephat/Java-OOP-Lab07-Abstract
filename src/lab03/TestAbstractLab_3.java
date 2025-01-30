package lab03;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class UIPanel {
    private UIControl[] controls;

    public UIPanel(UIControl[] controls) {
        this.controls = controls;
    }

    public void drawAll(Graphics g) {
        for (UIControl control : controls) {
            control.draw(g);
        }
    }
}

public class TestAbstractLab_3 {
    public static void main(String[] args) throws Exception {
        UIControl button = new Button("Test");
        UIControl textBox = new TextBox("Placeholder");
        UIControl colorPicker = new ColorPicker(Color.GREEN);

        UIControl[] controls = { button, textBox, colorPicker };

        UIPanel panel = new UIPanel(controls);

        JFrame frame = new JFrame("UI Panel");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                panel.drawAll(g);
            }
        };

        frame.add(jPanel);
        frame.setVisible(true);
    }
}
