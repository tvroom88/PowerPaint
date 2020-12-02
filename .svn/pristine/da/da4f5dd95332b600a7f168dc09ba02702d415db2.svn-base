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

import tools.EllipseTool;
import tools.Tool;
import view.PaintPanel;

/**
 * When Ellipse tool is chosen, this action will be called.
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020 
 */


public class EllipseAction extends AbstractAction {

    /** serialVersionUID */
    private static final long serialVersionUID = -9151288347950033861L;

    private final PaintPanel myPanel;

    private final Tool myTool;

    /**
     * Construct an Ellipse tool's Action
     */
    public EllipseAction(final PaintPanel thePanel) {
        super("Ellipse", new ImageIcon("./images/ellipse.gif"));
        this.myPanel = Objects.requireNonNull(thePanel, "thePanel shouldn't empty");;
        this.myTool = new EllipseTool();

//        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_U);
        putValue(Action.SELECTED_KEY, true);

    }

    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./images/ellipse_bw.gif");
        Cursor c = toolkit.createCustomCursor(image, new Point(myPanel.getX(), myPanel.getY()), "img");
        myPanel.setCursor(c);

        myPanel.setTool(myTool);
        myPanel.repaint();
    }

}

