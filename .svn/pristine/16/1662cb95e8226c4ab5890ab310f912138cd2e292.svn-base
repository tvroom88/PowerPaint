package tools;

import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
/**
 * Build a Pencil Tool
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020 
 */
public class PencilTool extends AbstractPaintTool {

    private GeneralPath myPath;

    /**
     * the mnemonic for this tool
     */
    private static final int MY_MNEMONIC = KeyEvent.VK_P;

    /**
     * Constructs a pencil tool.
     */
    public PencilTool() {
        super(MY_MNEMONIC);

        myPath = new GeneralPath();
    }

    @Override
    public Shape paintedShape() {
        // TODO Auto-generated method stub

        myPath.lineTo(getEndingPoint().getX(), getEndingPoint().getY());
        return myPath;
    }

    @Override
    public void setStartingPoint(final Point2D theStartingPoint) {
        myPath = new GeneralPath();
        myPath.moveTo(theStartingPoint.getX(), theStartingPoint.getY());
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
