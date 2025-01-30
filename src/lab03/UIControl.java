package lab03;

import java.awt.Color;
import java.awt.Graphics;

public abstract class UIControl {
    abstract public void draw(Graphics g);
    abstract public void handleEvent(String event);
    abstract public String getName();
}

class Button extends UIControl {
    private String label;

    public Button(String label) {
        this.label = label;
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 50);
        g.setColor(Color.BLACK);
        g.drawString(label, 50 + (200 - g.getFontMetrics().stringWidth(label)) / 2, 50 + 30);
    }

    @Override
    public void handleEvent(String event) {
        System.out.println("Button is " + event);
    }

    @Override
    public String getName() {
        return "Button";
    }
}

class TextBox extends UIControl {
    private String text;

    public TextBox(String text) {
        this.text = text;
    }

    
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(50, 150, 300, 40);
        g.setColor(Color.BLACK);
        g.drawRect(50, 150, 300, 40);
        g.drawString(text, 50 + 5, 150 + 25);
    }

    @Override
    public void handleEvent(String event) {
        System.out.println("Text field is " + event);
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}

class ColorPicker extends UIControl {
    private Color color;

    public ColorPicker(Color color) {
        this.color = color;
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(50, 250, 50, 50);
        g.setColor(Color.MAGENTA);
        g.drawRect(50, 250, 50, 50);
    }

    @Override
    public void handleEvent(String event) {
        System.out.println("Color selected: " + event);
    }

    @Override
    public String getName() {
        return "ColorPicker";
    }
}