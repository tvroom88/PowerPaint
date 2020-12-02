/*
 * TCSS 305 – Fall 2020
 * Assignment 4 - PowerPaint.
 */
package actions;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Objects;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

import tools.RectangleTool;
import tools.Tool;
import view.PaintPanel;

/**
 * When Rectangle tool is chosen, this action will be called.
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020 
 */

public class RectangleAction extends AbstractAction {

    /** serialVersionUID */
    private static final long serialVersionUID = -9151288347950033861L;

    private final PaintPanel myPanel;
    
    private final Tool myTool;

    /**
     * Construct an Rectangle tool's Action
     */
    public RectangleAction(final PaintPanel thePanel) {
        super("Rectangle", new ImageIcon("./images/rectangle.gif"));
        this.myPanel = Objects.requireNonNull(thePanel, "thePanel shouldn't empty");;
        this.myTool = new RectangleTool();
        putValue(Action.MNEMONIC_KEY, myTool.getMnemonic());
        putValue(Action.SELECTED_KEY, true);

    }

    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./images/rectangle_bw.gif");
        Cursor c = toolkit.createCustomCursor(image, new Point(myPanel.getX(), myPanel.getY()), "img");
        myPanel.setCursor(c);
        myPanel.setTool(myTool);
        myPanel.repaint();
    }

}
