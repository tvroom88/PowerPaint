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

import tools.PencilTool;
import tools.Tool;
import view.PaintPanel;

/**
 * When Pencil tool is chosen, this action will be called.
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020 
 */

public class PencilAction extends AbstractAction {

    /**
     * 
     */
    private static final long serialVersionUID = 3385183980985042176L;

    private final PaintPanel myPanel;

    private final Tool myTool;

    /**
     * Construct an Pencil tool's Action
     */
    public PencilAction(final PaintPanel thePanel) {
        
        super("Pencil", new ImageIcon("./images/pencil.gif"));
        this.myPanel = Objects.requireNonNull(thePanel, "thePanel shouldn't empty");;
        myTool = new PencilTool();

//        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_P);
        putValue(Action.SELECTED_KEY, true);

    }

    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        myPanel.setTool(myTool);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./images/pencil_bw.gif");
        Cursor c = toolkit.createCustomCursor(image, new Point(myPanel.getX(), myPanel.getY()), "img");
        myPanel.setCursor(c);
        myPanel.setTool(myTool);
        myPanel.repaint();
    }

}
