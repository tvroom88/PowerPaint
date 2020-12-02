package model;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

public class ColorItemIcon implements Icon {

    /** The Color Icon width. */
    private static final int COLOR_ICON_WIDTH = 10;
    
    /** The Color Icon height. */
    private static final int COLOR_ICON_HEIGHT = 10;

    /** The Color Icon's color. */
    private Color myColor;

    /**
     * Construct an ColorItemIcon
     */
    public ColorItemIcon(Color theColor) {
        this.myColor = theColor;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        // TODO Auto-generated method stub

        g.setColor(myColor);
        g.drawRect(x, y, COLOR_ICON_WIDTH, COLOR_ICON_HEIGHT);

        g.setColor(myColor);
        g.fillRect(x, y, COLOR_ICON_WIDTH, COLOR_ICON_HEIGHT);

    }

    @Override
    public int getIconWidth() {
        // TODO Auto-generated method stub
        return COLOR_ICON_WIDTH;
    }

    @Override
    public int getIconHeight() {
        // TODO Auto-generated method stub
        return COLOR_ICON_HEIGHT;
    }

    public void setColor(final Color theColor) {
        this.myColor = theColor;
    }

    public Color getColor() {
        return myColor;
    }
}
