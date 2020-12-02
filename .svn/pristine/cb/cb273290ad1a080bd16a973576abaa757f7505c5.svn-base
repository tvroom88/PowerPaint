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

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

import tools.Tool;
import view.PaintPanel;

public class ToolActions extends AbstractAction{
    /**
     * Actions for tools
     * 
     * @author Jaehong Lee Student
     * @version Fall 2020 
     */

    /** serialVersionUID */
    private static final long serialVersionUID = 4282452400458639856L;
    private final PaintPanel myPanel;
 
    private final Tool myTool;

    /**
     * Construct tool's Action
     */
    public ToolActions(final PaintPanel thePanel, final Tool theTool) {
        super(theTool.toString(), new ImageIcon("./images/" + theTool.toString().toLowerCase() + ".gif"));
        this.myPanel = thePanel;
        this.myTool = theTool;

        
        putValue(Action.MNEMONIC_KEY, myTool.getMnemonic());
        putValue(Action.SELECTED_KEY, true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("./images/" + myTool.toString().toLowerCase() + "_bw.gif");
        Cursor c = toolkit.createCustomCursor(image , new Point(myPanel.getX(), myPanel.getY()), "img");
        myPanel.setCursor (c); 
        
        myPanel.setTool(myTool);
        myPanel.repaint();
    }

}
