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

import tools.EraserTool;
import tools.Tool;
import view.PaintPanel;

/**
 * When Eraser tool is chosen, this action will be called.
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020 
 */


public class EraserAction extends AbstractAction {

    /** serialVersionUID */
    private static final long serialVersionUID = 6269060910768992830L;

    private final Tool myTool;

    private final PaintPanel myPanel;

    /**
     * Construct an Eraser tool's Action
     */
    public EraserAction(final PaintPanel thePanel) {

        super("Eraser", new ImageIcon("./images/eraser.gif"));
        this.myPanel = Objects.requireNonNull(thePanel, "thePanel shouldn't empty");;
        this.myTool = new EraserTool();

//        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_E);
        putValue(Action.SELECTED_KEY, true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./images/eraser_bw.gif");
        Cursor c = toolkit.createCustomCursor(image, new Point(myPanel.getX(), myPanel.getY()), "img");
        myPanel.setCursor(c);

        myPanel.setTool(myTool);
        myPanel.repaint();

    }

}
