package tools;

import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

/**
 * Build a Rectangle Tool
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020 
 */
public class RectangleTool extends AbstractPaintTool {

    /**
     * the mnemonic for this tool
     */
    private static final int MY_MNEMONIC = KeyEvent.VK_R;

    /**
     * Constructs a rectangle tool.
     */
    public RectangleTool() {
        super(MY_MNEMONIC);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Shape paintedShape() {
        // TODO Auto-generated method stub
        final Shape theEplise = new Rectangle2D.Double();
        ((RectangularShape) theEplise).setFrameFromDiagonal(getStartingPoint(), getEndingPoint());
        return theEplise;
    }

    /**
     * @return simple class name without "Tool" {@inheritDoc}
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        int n = getClass().getSimpleName().length() - 4;
        sb.append(getClass().getSimpleName().substring(0, n));
        return sb.toString();
    }
}
