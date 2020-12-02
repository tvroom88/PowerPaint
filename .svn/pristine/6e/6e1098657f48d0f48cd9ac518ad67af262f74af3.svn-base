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

import tools.LineTool;
import tools.Tool;
import view.PaintPanel;

/**
 * When Line tool is chosen, this action will be called.
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020 
 */

public class LineAction extends AbstractAction {

    /**
     * 
     */
    private static final long serialVersionUID = 6769883115132730026L;

    private Tool myTool;

    private final PaintPanel myPanel;

    /**
     * Construct an Line tool's Action
     */
    public LineAction(final PaintPanel thePanel) {

        super("Line", new ImageIcon("./images/line.gif"));
        this.myPanel = Objects.requireNonNull(thePanel, "thePanel shouldn't empty");;
        this.myTool = new LineTool();
        
//        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_L);
        putValue(Action.SELECTED_KEY, true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./images/line_bw.gif");
        Cursor c = toolkit.createCustomCursor(image, new Point(myPanel.getX(), myPanel.getY()), "img");
        myPanel.setCursor(c);

        myPanel.setTool(myTool);
        myPanel.repaint();
    }
}
